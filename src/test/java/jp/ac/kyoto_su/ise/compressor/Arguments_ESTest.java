/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 03 07:53:55 GMT 2020
 */

package jp.ac.kyoto_su.ise.compressor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.ac.kyoto_su.ise.compressor.Arguments;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)

public class Arguments_ESTest extends Arguments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Arguments arguments0 = Arguments.parse(stringArray0);
      assertFalse(arguments0.versioninformation());
      assertFalse(arguments0.deleteOriginal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Ogq";
      stringArray0[1] = "J5o7}1X+E(6d ZR";
      stringArray0[2] = "O'*+kct:caKp9=[c";
      stringArray0[3] = "-#7";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "jp.ac.kyoto_su.ise.compressor.Arguments";
      stringArray0[7] = "sv)Bg";
      stringArray0[8] = "&(Aq'dNa5@ij)Y";
      try {
        Arguments.parse(stringArray0);
        fail("Expecting exception: Exception");

      } catch(Exception e) {
         //
         // \"-#7\" is not a valid option
         //
         verifyException("org.kohsuke.args4j.CmdLineParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {

      // Undeclared exception!
      try {
        Arguments.parse((String[]) null);

        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // args is null
         //
         verifyException("org.kohsuke.args4j.Utilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "java -jar compressor.jar [OPTIONS] <FILES...>\nOPTIONS\n    -c, --compress <ALGORITHM>    specifies compress algorithm. Default is \"gzip\".\n                                  Available: gzip, and bzip2.\n    -d, --delete-original         Delete original files after compression.\n    -v, --version                 print version.\n    -h, --help                    print this message.";
      Arguments arguments0 = Arguments.parse(stringArray0);
      boolean boolean0 = arguments0.needsToHelp();
      assertFalse(arguments0.versioninformation());
      assertFalse(boolean0);
      assertFalse(arguments0.deleteOriginal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.needsToHelp();
      assertFalse(arguments0.versioninformation());
      assertTrue(boolean0);
      assertFalse(arguments0.deleteOriginal());

  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try {
        Arguments.parse(stringArray0);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.kohsuke.args4j.CmdLineParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Arguments.version();
      assertEquals("1.2.0", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      arguments0.stream();
      assertFalse(arguments0.versioninformation());
      assertFalse(arguments0.deleteOriginal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.versioninformation();
      assertFalse(boolean0);
      assertFalse(arguments0.deleteOriginal());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      arguments0.compressor();
      assertFalse(arguments0.versioninformation());
      assertFalse(arguments0.deleteOriginal());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Arguments.helpMessage();
      assertEquals("java -jar compressor.jar [OPTIONS] <FILES...>\nOPTIONS\n    -c, --compress <ALGORITHM>    specifies compress algorithm. Default is \"gzip\".\n                                  Available: gzip, and bzip2.\n    -d, --delete-original         Delete original files after compression.\n    -v, --version                 print version.\n    -h, --help                    print this message.", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.deleteOriginal();
      assertFalse(arguments0.versioninformation());
      assertFalse(boolean0);
  }
}
