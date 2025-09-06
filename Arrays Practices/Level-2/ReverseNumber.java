import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        System.out.print("Reversed: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
