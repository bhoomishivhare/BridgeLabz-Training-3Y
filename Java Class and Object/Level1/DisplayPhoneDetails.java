class MobilePhone {
    String brand;
    String model;
    double price;

    // Method to display phone details
    void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "Samsung";
        m1.model = "Galaxy S25";
        m1.price = 85000;

        MobilePhone m2 = new MobilePhone();
        m2.brand = "Apple";
        m2.model = "iPhone 16";
        m2.price = 120000;

        m1.displayPhoneDetails();
        System.out.println();
        m2.displayPhoneDetails();
    }
}
