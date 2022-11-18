package main.com.nexient.cart.ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ApiGeneric {
    private static PrintStream ps;
    private static String logFilePath;

    public static void logPrintStream(String testCaseName) throws FileNotFoundException {
        logFilePath = "C:\\Users\\asarma\\ambawork\\NexportAutomation_Amba\\Showcase\\cartCheckout\\test-output" + File.separator +
                testCaseName + ".txt";
        File file = new File(logFilePath);
        FileOutputStream fos = new FileOutputStream(file, true);
        ps = new PrintStream(fos);
    }

    public static PrintStream getPrintStream() {
        return ps;
    }

    public static String getLogFilePath() {
        return logFilePath;
    }
}
