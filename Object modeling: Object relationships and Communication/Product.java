import java.util.*;

class Product {
    private String name;
    public Product(String name) { this.name = name; }
    public String getName() { return name; }
}

class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId) { this.orderId = orderId; }

    public void addProduct(Product p) { products.add(p); }

    public void showOrder() {
        System.out.println("Order #" + orderId + " contains:");
        for (Product p : products) {
            System.out.println(" - " + p.getName());
        }
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) { this.name = name; }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order #" + o);
    }

    @Override
    public String toString() { return name; }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Bhoomi");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c.placeOrder(o1);
        o1.showOrder();
    }
}
