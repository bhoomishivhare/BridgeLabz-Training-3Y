class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemCode = 501;
        item1.itemName = "Notebook";
        item1.price = 50;

        item1.displayItem();
        int qty = 5;
        System.out.println("Total Cost for " + qty + " items: " + item1.calculateTotalCost(qty));
    }
}
