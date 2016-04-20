package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LinuxUtils {

    public String executeCommand(String command) throws IOException {

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String result = scanner.next();
        return result;

    }

}
