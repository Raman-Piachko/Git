import org.apache.log4j.Logger;

import static util.InputUtils.inputString;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static final String START = "Enter your name ";
    private static final String HELLO = "Hello, %s";
    public static final String END = "Nice to meet you.";

    public static void main(String[] args) {
        String name = inputString(START);
        LOGGER.info(String.format(HELLO, name));
        LOGGER.info(END);
    }
}