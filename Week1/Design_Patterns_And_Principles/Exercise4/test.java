public class AdapterPatternTest {
    public static void main(String[] args) {
        // Step 5.1: Create instances of adaptee classes
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        SquareGateway squareGateway = new SquareGateway();

        // Step 5.2: Create adapter instances
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        PaymentProcessor squareProcessor = new SquareAdapter(squareGateway);

        // Step 5.3: Process payments through adapters
        payPalProcessor.processPayment(100.00);
        stripeProcessor.processPayment(200.00);
        squareProcessor.processPayment(300.00);
    }
}
