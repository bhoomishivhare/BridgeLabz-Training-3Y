import java.util.*;

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + " balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c);
    }

    public void showCustomers() {
        System.out.println("Bank: " + name + " Customers:");
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        Customer c1 = new Customer("Bhoomi", 5000);
        Customer c2 = new Customer("Aarav", 8000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        bank.showCustomers();

        c1.deposit(2000);
        c1.viewBalance();
    }
}
