import java.util.Random;

public class FootballTeam {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) heights[i] = 150 + rand.nextInt(101);
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0; for (int h : arr) s += h; return s;
    }

    public static double mean(int[] arr) { return sum(arr) / (double) arr.length; }

    public static int shortest(int[] arr) {
        int min = arr[0]; for (int h : arr) if (h < min) min = h; return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0]; for (int h : arr) if (h > max) max = h; return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Heights: "); for (int h : heights) System.out.print(h + " ");
        System.out.println("\nSum: " + sum(heights) + ", Mean: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights) + ", Tallest: " + tallest(heights));
    }
}
