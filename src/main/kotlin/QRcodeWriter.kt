// zxing
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel

// processing
import processing.core.PImage
import java.io.IOException

class QRWriter {
    private val format = BarcodeFormat.QR_CODE
    private val hints = hashMapOf(EncodeHintType.ERROR_CORRECTION to ErrorCorrectionLevel.M)

    fun createPImage(contents: String, size: Int): PImage {
        try {
            val writer = QRCodeWriter()
            val bitMatrix: BitMatrix = writer.encode(contents, format, size, size, hints)
            val bufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix)
            return PImage(bufferedImage)
        }catch (e: IOException){
            e.printStackTrace()
        }catch (e: WriterException){
            e.printStackTrace()
        }
        return PImage(size, size)
    }
}