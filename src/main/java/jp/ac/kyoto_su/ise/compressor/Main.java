package jp.ac.kyoto_su.ise.compressor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class Main {
  /**
  *圧縮をするためのメインプログラム。
  *ここでは引数を解析するクラスやデータを圧縮するクラスにデータを渡す。
  */
    public static final String VERSION = "1.2.0";

    public Main(String[] arguments) throws Exception {
      /**
      *引数を解析してヘルプとバージョンの情報を出力するか、圧縮処理をするかを決定する。
      */
        Arguments args = Arguments.parse(arguments);
        if(args.versioninformation()) {
          System.out.println(Arguments.version());
          return;
        }
        if(args.needsToHelp()) {
            System.out.println(Arguments.helpMessage());
            return;
        }

        perform(args);
    }

    public void perform(Arguments args) throws NoCompressorException {
      /**
      *引数のファイルをストリームにして圧縮するメソッドに渡す。
      */
        Compressor compressor = args.compressor();
        args.stream().map(file -> Pair.of(file, compressor.renameFile(file)))  //mapに指定された形式にしたストリームを返す
                .forEach(pair -> performEach(compressor, pair));
        if(args.deleteOriginal()) {
            args.stream()
                    .forEach(file -> new File(file).deleteOnExit());
        }
    }

    public void performEach(Compressor compressor, Pair<String, String> pair) {
      /**
      *ストリーム情報に合わせて圧縮する方式を帰るメソッド。
      */
        String originalFileName = pair.map((l, r) -> l);
        String destFileName = pair.map((l, r) -> r);

        try(InputStream in = Files.newInputStream(Paths.get(originalFileName));
            OutputStream out = Files.newOutputStream(Paths.get(destFileName))) {
            compressor.compress(in, out);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new Main(args);
    }
}
