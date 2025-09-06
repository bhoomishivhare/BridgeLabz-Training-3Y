import java.util.Scanner;

public class Friends {

    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) if (age < min) min = age;
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (cm): ");
            heights[i] = sc.nextDouble();
        }

        int youngest = findYoungest(ages);
        double tallest = findTallest(heights);

        for (int i = 0; i < 3; i++) {
            if (ages[i] == youngest) System.out.println(names[i] + " is youngest.");
            if (heights[i] == tallest) System.out.println(names[i] + " is tallest.");
        }
    }
}
