package jp.ac.kyoto_su.ise.compressor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompressor implements Compressor {
    @Override
    public void compress(InputStream in, OutputStream out) throws IOException {
        GZIPOutputStream gzipOut = new GZIPOutputStream(out);
        drain(in, gzipOut);
        gzipOut.finish();
    }

    @Override
    public String renameFile(String originalFileName) {
        return originalFileName + ".gz";
    }
}
