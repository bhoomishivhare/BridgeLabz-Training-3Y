public class NumberProperties {

    public static int[] digitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        String str = String.valueOf(num);
        return str.contains("0") ? false : true;  // Duck number has no leading zeros
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        int temp = square;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int[] digits = digitsArray(num);
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || String.valueOf(num).endsWith("7");
    }

    public static void main(String[] args) {
        int number = 7;

        System.out.println("Is Duck? " + isDuckNumber(number));
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));
    }
}
