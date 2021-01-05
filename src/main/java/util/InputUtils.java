package util;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class InputUtils {
    private static final Logger LOGGER = Logger.getLogger(InputUtils.class);

    public static String inputString(String message) {
        LOGGER.info(message);
        return new Scanner(System.in).nextLine();
    }
}