import processing.core.*

class Main : PApplet(){
    private lateinit var qrcode: PImage

    override fun settings() {
        size(500, 500)
        var contents = if(args.isNotEmpty()){
            args[0]
        } else {
            "にゃーん"
        }
        qrcode = QRWriter().createPImage(contents, 500)
    }

    override fun setup() {

    }

    override fun draw() {
        image(qrcode, 0f, 0f)
    }
}

fun main(args: Array<String>) {
    var contents = if(args.isNotEmpty()){
        args[0]
    } else {
        val console = System.console() ?: null
        println("生成したいQRコードの文字列を入力してください。")
        console?.readLine() ?: readLine() ?: ""
    }

    if(contents.isBlank()) {
        contents = "にゃーん"
        println("にゃーん")
    }

    PApplet.main(Main::class.java, contents)
}