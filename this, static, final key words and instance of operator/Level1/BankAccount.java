public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.0);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.0);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
