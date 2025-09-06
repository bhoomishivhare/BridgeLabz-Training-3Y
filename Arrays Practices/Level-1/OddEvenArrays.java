import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        int[] evens = new int[num/2 + 1];
        int[] odds = new int[num/2 + 1];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + " ");
        }

        sc.close();
    }
}
