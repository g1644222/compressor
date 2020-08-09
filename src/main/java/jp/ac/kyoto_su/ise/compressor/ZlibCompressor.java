package jp.ac.kyoto_su.ise.compressor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.Scanner;
import java.util.zip.*;
import java.io.*;

public class ZlibCompressor implements Compressor{
  /**
  *zlib圧縮を実行するクラス。
  */
  @Override
  public void compress(InputStream in, OutputStream out) throws IOException {
    OutputStream zlibOut = new DeflaterOutputStream(out);
    drain(in, zlibOut);
    // zlibOut.finish();
  }

  @Override
  public String renameFile(String originalFileName) {
    return originalFileName + ".zlib";
  }
}
