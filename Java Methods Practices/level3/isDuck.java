public class NumberChecker {

    public static boolean isDuck(int num) {
        int[] digits = digitsArray(num);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = digitsArray(num);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Is Duck? " + isDuck(number));
        System.out.println("Is Armstrong? " + isArmstrong(number));
    }
}
