public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Step 5.1: Create a base notifier (EmailNotifier)
        Notifier emailNotifier = new EmailNotifier();

        // Step 5.2: Wrap the base notifier with decorators
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Step 5.3: Send notifications via multiple channels
        slackNotifier.send("This is a test notification.");
    }
}
