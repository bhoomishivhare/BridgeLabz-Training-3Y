
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();  

        String[] names = new String[n];
        int[] basic = new int[n];

        // Input details
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of employee " + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter basic salary: ");
            basic[i] = sc.nextInt();
            sc.nextLine();
        }

        // Print salary slips
        System.out.println("\n===== Salary Slips =====");
        for (int i = 0; i < n; i++) {
            double hra = 0.2 * basic[i];   // 20% HRA
            double da  = 0.1 * basic[i];   // 10% DA
            double gross = basic[i] + hra + da;

            double tax = (gross > 50000) ? 0.1 * gross : 0;
            double net = gross - tax;

            System.out.println("\n--- " + names[i] + " ---");
            System.out.println("Basic: " + basic[i]);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Gross: " + gross);
            if (tax > 0) System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + net);
        }

        sc.close();
    }
}