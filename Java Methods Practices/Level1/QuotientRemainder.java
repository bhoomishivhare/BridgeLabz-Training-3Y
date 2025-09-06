import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int num = input.nextInt();
        int div = input.nextInt();

        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}
