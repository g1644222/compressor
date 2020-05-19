![Hex.pm](https://img.shields.io/hexpm/l/Apa)



# compressor
エンピリカルソフトウェア工学のソースコード  
引数で与えられたファイルをgzip(bzip2)圧縮を行うプログラム  

## インストール
* githubからクローンしてきてください
* クローンしてきたディクレクトリに移動してください
* シェルスクリプトを使いコンパイルをしてください  

* これらの作業は下記のコマンドから行うことができます
    * `git clone https://github.com/g1644222/compressor.git`  
    * `cd compressor`
    * `mvn install`

## 使用方法
プログラムを実行するには、`java`コマンドの`jar`オプションにcompressor-0.1.0.jarを指定してください。  
* `java -jar compressor-1.0.0.jar [OPTIONS] <FILES...>`
ヘルプメッセージは以下の通りです。
```sh
OPTIONS
    -c, --compress <ALGORITHM>    specifies compress algorithm. Default is `gzip`.
                                  Available: gzip, and bzip2
    -d, --delete-original         Delete original files after compression.
    -v, --version                 print version.
    -h, --help                    print this message.
```

<!-- ## アップデート予定
バージョン表示の実装 -->