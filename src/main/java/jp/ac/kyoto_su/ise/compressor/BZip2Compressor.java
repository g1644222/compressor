package jp.ac.kyoto_su.ise.compressor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class BZip2Compressor implements Compressor {
    @Override
    public void compress(InputStream in, OutputStream out) throws IOException {
        BZip2CompressorOutputStream bzip2Out = new BZip2CompressorOutputStream(out);
        drain(in, bzip2Out);
        bzip2Out.finish();
    }

    @Override
    public String renameFile(String originalFileName) {
        return originalFileName + ".bz2";
    }
}
