package SOLID.OpenClose;


public class WrongOCP
{
    public static void main(String[] args) {

        SwiggyWithoutOCP obj = new SwiggyWithoutOCP();
        // Existing payment methods
        obj.processPayment(1, 500.0, "CreditCard");
        obj.processPayment(2, 200.0, "PayPal");

        // If a new payment method is added (e.g., Google Pay), we will need to modify the `processPayment` method

    }
}


class SwiggyWithoutOCP {
    public void processPayment(int orderId, double amount, String paymentMethod) {
        // Payment logic for different methods
        if (paymentMethod.equals("CreditCard")) {
            // Process credit card payment
            System.out.println("Processing credit card payment for ₹" + amount + " for order ID: " + orderId);
        } else if (paymentMethod.equals("PayPal")) {
            // Process PayPal payment
            System.out.println("Processing PayPal payment for ₹" + amount + " for order ID: " + orderId);
        } else {
            System.out.println("Unknown payment method: " + paymentMethod);
        }

        //need to change this class if any new payment method needed tomorrow.
    }
}
