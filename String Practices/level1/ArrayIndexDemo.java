import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Out of bounds
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};

        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}
