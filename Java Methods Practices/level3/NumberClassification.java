public class NumberClassification {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Perfect number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Abundant number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Deficient number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Strong number (sum of factorials of digits = number)
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Helper method for factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;

        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
