package jp.ac.kyoto_su.ise.compressor;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class ArgumentsTest {
    @Test
    public void testHelp() throws Exception {
        Arguments args1 = Arguments.parse("--help hoge.txt".split(" "));
        assertThat(args1.needsToHelp(), is(true));
        
        Arguments args2 = Arguments.parse(new String[0]);
        assertThat(args2.needsToHelp(), is(true));
        
    }
}
