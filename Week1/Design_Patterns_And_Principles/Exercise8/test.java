public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(250.00);

        // Use PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "securepassword");
        context.setPaymentStrategy(payPalPayment);
        context.pay(150.00);
    }
}
