import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int num) { return num >= 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (isPositive(n)) System.out.println(n + " is Positive and " + (isEven(n) ? "Even" : "Odd"));
            else System.out.println(n + " is Negative");
        }

        int cmp = compare(arr[0], arr[4]);
        if (cmp == 1) System.out.println("First element > Last element");
        else if (cmp == -1) System.out.println("First element < Last element");
        else System.out.println("First element = Last element");
    }
}
