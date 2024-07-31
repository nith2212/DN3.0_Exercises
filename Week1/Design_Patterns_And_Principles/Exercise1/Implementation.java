public class SingletonPatternTest {
    public static void main(String[] args) {
        // Step 4.1: Get the instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Step 4.2: Verify that both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }

        // Step 4.3: Use the logger instance to log messages
        logger1.log("Logging message from logger1.");
        logger2.log("Logging message from logger2.");
    }
}
