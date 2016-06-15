package utils;

import org.junit.Test;

import javax.script.ScriptException;

public class NashornUtilsTest {

    NashornUtils nashornUtils;

    public NashornUtilsTest() {
        nashornUtils = new NashornUtils();
    }

    @Test
    public void test001() throws ScriptException {
        nashornUtils.executeScript("print('Nashorn Test 001')");
    }

}
