public class NumCheck {

    public static int countDigits(int num) {
        int count = 0;
        num = Math.abs(num);
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int[] digitsArray(int num) {
        int len = countDigits(num);
        int[] digits = new int[len];
        num = Math.abs(num);
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Digit count: " + countDigits(number));
        int[] digits = digitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
    }
}
