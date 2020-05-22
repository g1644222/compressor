/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 05:44:33 GMT 2020
 */

package jp.ac.kyoto_su.ise.compressor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import jp.ac.kyoto_su.ise.compressor.BZip2Compressor;
import jp.ac.kyoto_su.ise.compressor.Compressor;
import jp.ac.kyoto_su.ise.compressor.GzipCompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Compressor_ESTest extends Compressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      gzipCompressor0.renameFile("'?#j?:");
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        gzipCompressor0.compress(inputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      gzipCompressor0.renameFile((String) null);
      gzipCompressor0.renameFile("D&Mj'iE");
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      gzipCompressor0.compress(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      gzipCompressor0.drain(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      try { 
        Compressor.compressor("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // : compressor not found
         //
         verifyException("jp.ac.kyoto_su.ise.compressor.Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BZip2Compressor bZip2Compressor0 = new BZip2Compressor();
      String string0 = null;
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read();
      OutputStream outputStream0 = null;
      // Undeclared exception!
      try { 
        bZip2Compressor0.drain(inputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BZip2Compressor bZip2Compressor0 = new BZip2Compressor();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bZip2Compressor0.compress(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      gzipCompressor0.renameFile("%s: compressor not found");
      try { 
        Compressor.compressor("<,A");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // <,A: compressor not found
         //
         verifyException("jp.ac.kyoto_su.ise.compressor.Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BZip2Compressor bZip2Compressor0 = new BZip2Compressor();
      assertNotNull(bZip2Compressor0);
      
      String string0 = "gzip";
      String string1 = bZip2Compressor0.renameFile("gzip");
      assertEquals("gzip.bz2", string1);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      String string2 = bZip2Compressor0.renameFile("gzip");
      assertEquals("gzip.bz2", string2);
      assertFalse(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotNull(string2);
      
      String string3 = bZip2Compressor0.renameFile("");
      assertEquals(".bz2", string3);
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertNotNull(string3);
      
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      assertNotNull(gzipCompressor0);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      Compressor compressor0 = Compressor.compressor("gzip");
      assertFalse(compressor0.equals((Object)gzipCompressor0));
      assertNotNull(compressor0);
      assertNotSame(compressor0, gzipCompressor0);
      
      String string4 = compressor0.renameFile("");
      assertEquals(".gz", string4);
      assertFalse(compressor0.equals((Object)gzipCompressor0));
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string2));
      assertNotNull(string4);
      assertNotSame(compressor0, gzipCompressor0);
      
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      gzipCompressor0.compress(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      assertNotNull(gzipCompressor0);
      
      String string0 = "len(";
      String string1 = gzipCompressor0.renameFile("len(");
      assertEquals("len(.gz", string1);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      gzipCompressor0.compress(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      assertNotNull(gzipCompressor0);
      
      String string0 = gzipCompressor0.renameFile("!*02S~USK=G'J'rNsy");
      assertEquals("!*02S~USK=G'J'rNsy.gz", string0);
      assertNotNull(string0);
      
      String string1 = gzipCompressor0.renameFile("?)");
      assertEquals("?).gz", string1);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      gzipCompressor0.drain(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = null;
      try { 
        Compressor.compressor((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // null: compressor not found
         //
         verifyException("jp.ac.kyoto_su.ise.compressor.Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BZip2Compressor bZip2Compressor0 = new BZip2Compressor();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(inputStream0).read();
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bZip2Compressor0.drain(inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GzipCompressor gzipCompressor0 = new GzipCompressor();
      String string0 = "bzip2";
      Compressor.compressor("bzip2");
      Compressor compressor0 = Compressor.compressor("bzip2");
      compressor0.renameFile("ZcEa-8%KFL%m#d*K");
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read();
      OutputStream outputStream0 = null;
      // Undeclared exception!
      try { 
        gzipCompressor0.drain(inputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
