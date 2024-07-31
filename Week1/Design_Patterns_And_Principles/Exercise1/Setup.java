public class Logger {
    // Step 2.1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2.2: Make the constructor private to prevent instantiation
    private Logger() {
        // private constructor
    }

    // Step 2.3: Provide a public static method to get the instance of the Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println(message);
    }
}
