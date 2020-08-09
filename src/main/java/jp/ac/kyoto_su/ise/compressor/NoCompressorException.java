package jp.ac.kyoto_su.ise.compressor;

public class NoCompressorException extends Exception {
  /**
  * 圧縮するクラスの呼び出しに失敗した場合、エラー原因を出力する
  */
    public NoCompressorException(String message) {
        super(message);
    }
}
