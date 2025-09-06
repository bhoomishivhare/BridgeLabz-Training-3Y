import java.util.ArrayList;
import java.util.Scanner;

public class NumberFactors {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int sumSquareFactors(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += Math.pow(n, 2);
        return sum;
    }

    public static int productFactors(int[] arr) {
        int prod = 1;
        for (int n : arr) prod *= n;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Sum of squares: " + sumSquareFactors(factors));
        System.out.println("Product: " + productFactors(factors));
    }
}
