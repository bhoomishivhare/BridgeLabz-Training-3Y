class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity = qty;
        System.out.println(name + " added to cart.");
    }

    void removeItem() {
        System.out.println(itemName + " removed from cart.");
        itemName = null;
        price = 0;
        quantity = 0;
    }

    double totalCost() {
        return price * quantity;
    }

    void displayItem() {
        if (itemName != null) {
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + totalCost());
        } else {
            System.out.println("Cart is empty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.addItem("Laptop", 50000, 2);
        item.displayItem();
        item.removeItem();
        item.displayItem();
    }
}
