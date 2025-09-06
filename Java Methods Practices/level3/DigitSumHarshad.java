public class DigitSumHarshad {

    public static int[] digitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static int sumOfDigits(int num) {
        int[] digits = digitsArray(num);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int num) {
        int[] digits = digitsArray(num);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

    public static void main(String[] args) {
        int number = 18;

        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad? " + isHarshad(number));
    }
}
