# P5QRcodeWriter
This is a QR code generation tool created with Processing (for Kotlin).  
**“QR Code” is a registered trademark of DENSO WAVE INCORPORATED.**

En | [Ja](./README.ja.md)  

## Use Library
- [shadow](https://github.com/johnrengelman/shadow) ([Apache License](http://www.apache.org/licenses/LICENSE-2.0))
- [ZXing](https://github.com/zxing/zxing) ([Apache License](http://www.apache.org/licenses/LICENSE-2.0))

## Usage
### Getting
#### Clone this project
```bash
mkdir Your_Project_Name
cd Your_Project_Name
git clone https://github.com/kota-shiokara/P5QRcodeWriter.git
```
#### Build this project
```bash
./gradle shadow # Mac or Linux
gradle shadow # Windows
```
**The output file is stored under build/libs/.**

#### or
#### Download the latest release
You can download the latest release from the release section.

### Run
```bash
java -jar "P5QRcodeWriter-{latest version}.jar" "content"
```
For the content, enter the string you want to use as QRcode.  
It is possible to enter the string from the console after the process has started even without the command line argument.

## Example
The following image is an example of generation.

![image](./img/output.png)

## Author
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## About Report
Please use [issue](https://github.com/kota-shiokara/ProcessingForKotlinTemplate/issues) for filing feature requests and bug reports. Or use the contact information above.

## License
[MIT License](https://choosealicense.com/licenses/mit/)