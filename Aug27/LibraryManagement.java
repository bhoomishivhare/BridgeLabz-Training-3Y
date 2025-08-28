
import java.util.Scanner;

public class LibraryManagement {
    public static int calculateFine(int daysLate) {
        int fine = 0;
        if (daysLate >= 1 && daysLate <= 5) {
            fine = daysLate * 10;
        } else if (daysLate >= 6 && daysLate <= 10) {
            fine = daysLate * 20;
        } else if (daysLate > 10) {
            fine = daysLate * 50;
        }
        return fine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean moreStudents = true;

        while (moreStudents) {
            System.out.print("Enter student name: ");
            String student = sc.next();

            System.out.print("Enter number of books borrowed: ");
            int books = sc.nextInt();

            int totalFine = 0;
            for (int i = 1; i <= books; i++) {
                System.out.println("\nBook " + i + " details:");
                System.out.print("Enter book category (1-Regular, 2-Reference, 3-Magazine): ");
                int category = sc.nextInt();

                switch (category) {
                    case 1:
                        System.out.println("Book category: Regular");
                        break;
                    case 2:
                        System.out.println("Book category: Reference");
                        break;
                    case 3:
                        System.out.println("Book category: Magazine");
                        break;
                    default:
                        System.out.println("Invalid category, assuming Regular.");
                }
                int fine = 0;
                int daysLate;
                do {
                    System.out.print("Enter number of days late: ");
                    daysLate = sc.nextInt();
                    fine = calculateFine(daysLate);
                }while (daysLate < 0);

                System.out.println("Fine for this book: ₹" + fine);
                totalFine += fine;
            }

            System.out.println("\nTotal fine for " + student + ": ₹" + totalFine);

            System.out.print("\nDo you want to check for another student? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                moreStudents = false;
            }
        }
        System.out.println("\nLibrary Fine Calculation Ended.");
    }
}
