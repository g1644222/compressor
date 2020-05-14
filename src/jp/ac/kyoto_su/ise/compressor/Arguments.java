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
        return helpFlag || arguments.size() == 0;
    }

    public boolean deleteOriginal() {
        return deleteFlag;
    }

    public Stream<String> stream() {
        return arguments.stream();
    }

    public Compressor compressor() throws NoCompressorException {
        return Compressor.compressor(compressType);
    }

    public static Arguments parse(String[] args) throws CmdLineException {
        Arguments arguments = new Arguments();
        CmdLineParser parser = new CmdLineParser(arguments);
        parser.parseArgument(args);
        return arguments;
    }

    public static final String helpMessage() {
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
