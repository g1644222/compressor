package jp.ac.kyoto_su.ise.compressor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.Optional;

public interface Compressor {
    void compress(InputStream in, OutputStream out) throws IOException;

    String renameFile(String originalFileName);

    default void drain(InputStream in, OutputStream out) throws IOException {
        int data;
        while((data = in.read()) != -1) {
            out.write(data);
        }
    }

    static Compressor compressor(String algorithm) throws NoCompressorException {
        if(Objects.equals(algorithm, "gzip")){
            return new GzipCompressor();
        }
        else if(Objects.equals(algorithm, "bzip2")){
            return new BZip2Compressor();
        }
        throw new NoCompressorException(String.format("%s: compressor not found", algorithm));
    }
}
