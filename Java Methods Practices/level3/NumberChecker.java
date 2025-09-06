public class NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] digitsArray(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuck(int num) {
        for (int d : digitsArray(num)) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = digitsArray(num);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    public static int[] largestAndSecondLargest(int num) {
        int[] digits = digitsArray(num);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestAndSecondSmallest(int num) {
        int[] digits = digitsArray(num);
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2) min2 = d;
        }
        return new int[]{min1, min2};
    }

    public static int sumDigits(int num) {
        int sum = 0; for (int d : digitsArray(num)) sum += d; return sum;
    }

    public static int sumSquaresDigits(int num) {
        int sum = 0; for (int d : digitsArray(num)) sum += d*d; return sum;
    }

    public static boolean isHarshad(int num) {
        return num % sumDigits(num) == 0;
    }

    public static int[] reverseDigits(int num) {
        int[] arr = digitsArray(num); int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) rev[i] = arr[n - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int num) {
        int[] arr = digitsArray(num); int[] rev = reverseDigits(num);
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }
}
