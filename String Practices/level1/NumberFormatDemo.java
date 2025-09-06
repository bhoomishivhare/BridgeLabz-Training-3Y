import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string number: ");
        String str = input.nextLine();

        // generateException(str); // Uncomment to crash
        handleException(str);
    }
}
