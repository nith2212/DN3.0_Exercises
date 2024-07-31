// Adaptee class for PayPal
public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

// Adaptee class for Stripe
public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}

// Adaptee class for Square
public class SquareGateway {
    public void doPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }
}
// Adapter for PayPal
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }
}

// Adapter for Stripe
public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.makePayment(amount);
    }
}

// Adapter for Square
public class SquareAdapter implements PaymentProcessor {
    private SquareGateway squareGateway;

    public SquareAdapter(SquareGateway squareGateway) {
        this.squareGateway = squareGateway;
    }

    @Override
    public void processPayment(double amount) {
        squareGateway.doPayment(amount);
    }
}
