![Hex.pm](https://img.shields.io/hexpm/l/Apa)
[![Build Status](https://travis-ci.com/g1644222/compressor.svg?token=xdZ1c89i5sEL5QfrybCz&branch=master)](https://travis-ci.com/g1644222/compressor)
[![Coverage Status](https://coveralls.io/repos/github/g1644222/compressor/badge.svg?branch=updata_unit_test)](https://coveralls.io/github/g1644222/compressor?branch=updata_unit_test)


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
* `java -jar target/compressor-1.0.0.jar [OPTIONS] <FILES...>`
ヘルプメッセージは以下の通りです。
```sh
OPTIONS
    -c, --compress <ALGORITHM>    specifies compress algorithm. Default is `gzip`.
                                  Available: gzip, and bzip2
    -d, --delete-original         Delete original files after compression.
    -v, --version                 print version.
    -h, --help                    print this message.
```

## テスト方法
テストプログラムを動かすにはmavenを使用する。

    * プロジェクト以下のファイルを実行する方法
        `mvn test`

    * 指定したクラスのみを実行する方法
        `mvn test -Dtest=[クラス名]`
        `ex) mvn test -Dtest=Main_ESTest`

    * 指定したテストクラスのメソッドの実行する方法
        `mvn test -Dtest=[クラス名]#[メソッド名]`
        `ex) mvn test -Dtest=Main_ESTest#test01`

<!-- ## アップデート予定
バージョン表示の実装 -->
