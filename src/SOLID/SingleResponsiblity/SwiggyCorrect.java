package SOLID.SingleResponsiblity;

public class SwiggyCorrect {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService();
        restaurantService.addRestaurant("Pizza Palace", "MG Road, Bangalore");
        restaurantService.updateRestaurantMenu(101, "Pizza, Pasta, Drinks");

        OrderService orderService = new OrderService();
        orderService.placeOrder(1, 101, "Margherita Pizza, Garlic Bread");

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(1, 500.0);
    }
}

//restaurant responsiblity
class RestaurantService {
    public void addRestaurant(String restaurantName, String address) {

        System.out.println("Restaurant added: " + restaurantName);
    }

    public void updateRestaurantMenu(int restaurantId, String menu) {

        System.out.println("Menu updated for restaurant ID: " + restaurantId);
    }

    public void showRestaurantDetails(int restaurantId) {

        System.out.println("Showing details for restaurant ID: " + restaurantId);
    }
}

// Class responsible for processing orders
class OrderService {
    public void placeOrder(int orderId, int restaurantId, String items) {

        System.out.println("Order placed with ID: " + orderId + " for restaurant ID: " + restaurantId);
    }

    public void cancelOrder(int orderId) {

        System.out.println("Order cancelled with ID: " + orderId);
    }
}

//payment responsiblity in this class
class PaymentService {
    public void processPayment(int orderId, double amount) {

        System.out.println("Payment of ₹" + amount + " processed for order ID: " + orderId);
    }
}

