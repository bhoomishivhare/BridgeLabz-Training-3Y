import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative comparison
    public static boolean isPalindromeIterative(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Using reverse array
    public static boolean isPalindromeUsingArray(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String str = input.nextLine();

        System.out.println("Iterative: " + isPalindromeIterative(str));
        System.out.println("Recursive: " + isPalindromeRecursive(str, 0, str.length() - 1));
        System.out.println("Array-based: " + isPalindromeUsingArray(str));
    }
}
