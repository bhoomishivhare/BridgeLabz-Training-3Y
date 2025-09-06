import java.util.Scanner;

public class StringIndexException {

    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Out of bounds
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // generateException(str); // Uncomment to crash
        handleException(str);
    }
}
