import java.util.Scanner;

public class ChocolateDivision {

    public static int[] divideChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total chocolates and number of children: ");
        int chocolates = input.nextInt();
        int children = input.nextInt();

        int[] res = divideChocolates(chocolates, children);
        System.out.println("Each child gets: " + res[0] + ", Remaining chocolates: " + res[1]);
    }
}
