import java.util.Scanner;

public class SumNaturalNumbers {

    public static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        int sum = sumNatural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
