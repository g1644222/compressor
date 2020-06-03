/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 03 02:41:40 GMT 2020
 */

package jp.ac.kyoto_su.ise.compressor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Arguments_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jp.ac.kyoto_su.ise.compressor.Arguments"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9_/z01hkb294q37dg__df9yvd200000gn/T/"); 
    java.lang.System.setProperty("user.country", "JP"); 
    java.lang.System.setProperty("user.dir", "/Users/tamada/products/Lectures/2020ese/g1644222"); 
    java.lang.System.setProperty("user.home", "/Users/tamada"); 
    java.lang.System.setProperty("user.language", "ja"); 
    java.lang.System.setProperty("user.name", "tamada"); 
    java.lang.System.setProperty("user.timezone", "Asia/Tokyo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Arguments_ESTest_scaffolding.class.getClassLoader() ,
      "jp.ac.kyoto_su.ise.compressor.NoCompressorException",
      "org.kohsuke.args4j.spi.MultiValueFieldSetter",
      "jp.ac.kyoto_su.ise.compressor.GzipCompressor",
      "org.kohsuke.args4j.spi.OptionHandler",
      "org.kohsuke.args4j.OptionHandlerRegistry",
      "org.kohsuke.args4j.ParserProperties",
      "org.kohsuke.args4j.spi.FileOptionHandler",
      "org.kohsuke.args4j.Argument",
      "org.kohsuke.args4j.ClassParser",
      "org.kohsuke.args4j.Utilities",
      "org.kohsuke.args4j.OptionHandlerRegistry$OptionHandlerFactory",
      "org.kohsuke.args4j.spi.CharOptionHandler",
      "org.kohsuke.args4j.spi.LongOptionHandler",
      "org.kohsuke.args4j.CmdLineParser",
      "org.kohsuke.args4j.spi.ByteOptionHandler",
      "jp.ac.kyoto_su.ise.compressor.Compressor",
      "org.kohsuke.args4j.Option",
      "org.kohsuke.args4j.spi.InetAddressOptionHandler",
      "org.kohsuke.args4j.CmdLineException",
      "org.kohsuke.args4j.spi.StringOptionHandler",
      "jp.ac.kyoto_su.ise.compressor.Arguments",
      "org.kohsuke.args4j.OptionHandlerFilter$2",
      "org.kohsuke.args4j.OptionHandlerFilter$3",
      "org.kohsuke.args4j.spi.DoubleOptionHandler",
      "org.kohsuke.args4j.spi.Setters",
      "org.kohsuke.args4j.NamedOptionDef",
      "org.kohsuke.args4j.spi.FloatOptionHandler",
      "org.kohsuke.args4j.OptionHandlerFilter$1",
      "org.kohsuke.args4j.spi.EnumOptionHandler",
      "org.kohsuke.args4j.spi.IntOptionHandler",
      "org.kohsuke.args4j.Localizable",
      "org.kohsuke.args4j.OptionDef",
      "org.kohsuke.args4j.Messages",
      "org.kohsuke.args4j.spi.PatternOptionHandler",
      "org.kohsuke.args4j.spi.ShortOptionHandler",
      "org.kohsuke.args4j.spi.MapOptionHandler",
      "org.kohsuke.args4j.ParserProperties$1",
      "org.kohsuke.args4j.spi.URIOptionHandler",
      "org.kohsuke.args4j.spi.OneArgumentOptionHandler",
      "org.kohsuke.args4j.IllegalAnnotationError",
      "org.kohsuke.args4j.spi.Setter",
      "org.kohsuke.args4j.OptionHandlerFilter",
      "org.kohsuke.args4j.spi.PathOptionHandler",
      "org.kohsuke.args4j.spi.Parameters",
      "org.kohsuke.args4j.spi.URLOptionHandler",
      "org.kohsuke.args4j.spi.FieldSetter",
      "org.kohsuke.args4j.spi.BooleanOptionHandler",
      "org.kohsuke.args4j.ExampleMode",
      "org.kohsuke.args4j.spi.Getter",
      "org.kohsuke.args4j.OptionHandlerRegistry$DefaultConstructorHandlerFactory",
      "org.kohsuke.args4j.CmdLineParser$CmdLineImpl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Arguments_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jp.ac.kyoto_su.ise.compressor.Arguments",
      "jp.ac.kyoto_su.ise.compressor.GzipCompressor",
      "org.kohsuke.args4j.CmdLineParser",
      "org.kohsuke.args4j.ParserProperties$1",
      "org.kohsuke.args4j.ParserProperties",
      "org.kohsuke.args4j.ClassParser",
      "org.kohsuke.args4j.spi.Setters",
      "org.kohsuke.args4j.spi.FieldSetter",
      "org.kohsuke.args4j.Utilities",
      "org.kohsuke.args4j.OptionDef",
      "org.kohsuke.args4j.NamedOptionDef",
      "org.kohsuke.args4j.OptionHandlerRegistry",
      "org.kohsuke.args4j.OptionHandlerRegistry$DefaultConstructorHandlerFactory",
      "org.kohsuke.args4j.spi.OptionHandler",
      "org.kohsuke.args4j.spi.BooleanOptionHandler",
      "org.kohsuke.args4j.spi.StringOptionHandler",
      "org.kohsuke.args4j.spi.MultiValueFieldSetter",
      "org.kohsuke.args4j.CmdLineParser$CmdLineImpl",
      "org.kohsuke.args4j.CmdLineException",
      "org.kohsuke.args4j.Messages",
      "jp.ac.kyoto_su.ise.compressor.NoCompressorException"
    );
  }
}
