public class DigitPalindrome {

    public static int[] digitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseDigits(int num) {
        int[] digits = digitsArray(num);
        int len = digits.length;
        int[] reversed = new int[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = digits[len - i - 1];
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        int[] original = digitsArray(num);
        int[] reversed = reverseDigits(num);
        if (original.length != reversed.length) return false;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 12321;

        System.out.print("Reversed digits: ");
        for (int d : reverseDigits(number)) System.out.print(d);
        System.out.println("\nIs Palindrome? " + isPalindrome(number));
    }
}
