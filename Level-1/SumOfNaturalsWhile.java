import java.util.Scanner;

public class SumOfNaturalsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0, i = 1;

            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Formula sum = " + formulaSum);
            System.out.println("While loop sum = " + loopSum);
        } else {
            System.out.println("Not a natural number.");
        }
    }
}
