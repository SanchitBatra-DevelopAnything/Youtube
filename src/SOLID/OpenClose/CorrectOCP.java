package SOLID.OpenClose;

public class CorrectOCP {
    public static void main(String[] args) {
        SwiggyServiceWithOCP swiggyService = new SwiggyServiceWithOCP();

        // Using existing payment methods
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();
        PaymentMethod googlePay = new GooglePayPayment();  // New payment method

        swiggyService.processPayment(creditCard, 1, 500.0);
        swiggyService.processPayment(payPal, 2, 200.0);
        swiggyService.processPayment(googlePay, 3, 300.0);  // We can add this without modifying the existing code
    }
}

// Swiggy service now open for extension but closed for modification
class SwiggyServiceWithOCP {
    public void processPayment(PaymentMethod paymentMethod, int orderId, double amount) {
        // Use the payment method interface to process payment
        paymentMethod.pay(orderId, amount);
    }
}

// Payment method interface (open for extension)
interface PaymentMethod {
    void pay(int orderId, double amount);
}

// Credit Card payment implementation
class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(int orderId, double amount) {
        // Logic for processing credit card payment
        System.out.println("Processing credit card payment for ₹" + amount + " for order ID: " + orderId);
    }
}

// PayPal payment implementation
class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(int orderId, double amount) {
        // Logic for processing PayPal payment
        System.out.println("Processing PayPal payment for ₹" + amount + " for order ID: " + orderId);
    }
}

// New Google Pay payment implementation (we can add this without modifying existing code)
class GooglePayPayment implements PaymentMethod {
    @Override
    public void pay(int orderId, double amount) {
        // Logic for processing Google Pay payment
        System.out.println("Processing Google Pay payment for ₹" + amount + " for order ID: " + orderId);
    }
}
