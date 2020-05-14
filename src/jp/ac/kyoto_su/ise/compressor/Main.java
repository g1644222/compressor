package jp.ac.kyoto_su.ise.compressor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class Main {
    public static final String VERSION = "0.1.0";

    public Main(String[] arguments) throws Exception {
        Arguments args = Arguments.parse(arguments);
        if(args.needsToHelp()) {
            System.out.println(Arguments.helpMessage());
            return;
        }
        perform(args);
    }

    public void perform(Arguments args) throws NoCompressorException {
        Compressor compressor = args.compressor();
        args.stream().map(file -> Pair.of(file, compressor.renameFile(file)))
                .forEach(pair -> performEach(compressor, pair));
        if(args.deleteOriginal()) {
            args.stream()
                    .forEach(file -> new File(file).deleteOnExit());
        }
    }

    public void performEach(Compressor compressor, Pair<String, String> pair) {
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
