# P5QRcodeWriter
Processing(for Kotlin)で作成されたQRコード生成ツールです。  
**QRコードは(株)デンソーウェーブの登録商標です**

[En](./README.md) | Ja  

## 使用ライブラリ
- [shadow](https://github.com/johnrengelman/shadow) ([Apache License](http://www.apache.org/licenses/LICENSE-2.0))
- [ZXing](https://github.com/zxing/zxing) ([Apache License](http://www.apache.org/licenses/LICENSE-2.0))

## 使い方
### 入手
#### プロジェクトのクローン
```bash
mkdir Your_Project_Name
cd Your_Project_Name
git clone https://github.com/kota-shiokara/P5QRcodeWriter.git
```
#### プロジェクトのビルド
```bash
./gradle shadow # Mac or Linux
gradle shadow # Windows
```
**出力ファイルはbuild/libs/以下に格納されます。**

#### もしくは
#### 最新版のリリースをダウンロード
最新版のリリースは、リリースセクションからダウンロードできます。

### Run
```bash
java -jar "P5QRcodeWriter-{latest version}.jar" "Content"
```
contentにはQRcodeにしたい文字列をいれてください。  
なお、コマンドライン引数が無くても処理開始後にコンソールから入力可能です。

## 開発者情報
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## 報告
バグの報告、改善の要望につきましては [issue](https://github.com/kota-shiokara/ProcessingForKotlinTemplate/issues) もしくは上記連絡先にお願いします。  

## License
[MIT License](https://choosealicense.com/licenses/mit/)