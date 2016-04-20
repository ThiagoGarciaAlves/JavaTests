package utils;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;

public class LinuxUtilsTest {

    LinuxUtils linuxUtils;

    public LinuxUtilsTest() {
        linuxUtils = new LinuxUtils();
    }

    @Test
    public void executaComandoTeste() {

        boolean exception = false;

        try {
            System.out.println(linuxUtils.executeCommand("pwd"));
        } catch (IOException e) {
            exception = true;
            e.printStackTrace();
        }

        assertFalse(exception);

    }

}
