package jp.ac.kyoto_su.ise.compressor;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Arguments {
  /**
  *引数を解析するためのクラス。
  *圧縮方式、圧縮元を消す、ヘルプ、バージョンの確認、ファイルの指定を行う。
  */
    @Option(name="-c", aliases="--compress", metaVar="ALGORITHM", usage="specifies compress algorithm. Default is \"gzip\"")
    private String compressType = "gzip";
    @Option(name="-d", aliases="--delete-original", usage="delete original files after compression.")
    private boolean deleteFlag = false;
    @Option(name="-h", aliases="--help", usage="print this message.")
    private boolean helpFlag = false;
    @Option(name="-v", aliases="--version", usage="print version.")
    private boolean versionFlag = false;
    @Argument(metaVar="FILES...", multiValued=true, usage="specifies files for compression.")
    private List<String> arguments = new ArrayList<>();

    public boolean needsToHelp() {
      /**
      *ヘルプを出力するかのメソッド。
      */
        return helpFlag || arguments.size() == 0;
    }

    public boolean deleteOriginal() {
      /**
      *圧縮元のデータを消すかどうかを判断するメソッド。
      */
        return deleteFlag;
    }

    public boolean versioninformation() {
      /**
      *バージョン情報を出力するか判断するメソッド
      */
        return versionFlag;
    }

    public Stream<String> stream() {
      /**
      *ストリーム情報を返すメソッド。
      */
        return arguments.stream();
    }

    public Compressor compressor() throws NoCompressorException {
      /**
      *圧縮方式を返すメソッド。
      */
        return Compressor.compressor(compressType);
    }

    public static Arguments parse(String[] args) throws CmdLineException {
      /**
      *引数を解析するためのメソッド。
      */
        Arguments arguments = new Arguments();
        CmdLineParser parser = new CmdLineParser(arguments);  //パースを読み込むためのクラス
        parser.parseArgument(args);
        return arguments;
    }

    public static final String helpMessage() {
      /**
      *
      * ヘルプメッセージ
      * -cは圧縮アルゴリズムの指定、デフォルトは「gzip」。他に「bzip2」が使用可能
      * -dは圧縮元のファイルを削除
      * -vは現在のシステムのバージョンを表示
      * -hはこのメッセージを出力
      */
        return String.format("java -jar compressor.jar [OPTIONS] <FILES...>%n" +
                "OPTIONS%n" +
                "    -c, --compress <ALGORITHM>    specifies compress algorithm. Default is \"gzip\".%n" +
                "                                  Available: gzip, and bzip2.%n" +
                "    -d, --delete-original         Delete original files after compression.%n" +
                "    -v, --version                 print version.%n" +
                "    -h, --help                    print this message.");
    }

    public static final String version() {
        return Main.VERSION;
    }
}
