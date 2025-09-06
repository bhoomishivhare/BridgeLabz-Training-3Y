import java.util.Scanner;

public class RandomN {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Random numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        double[] res = findAverageMinMax(numbers);
        System.out.println("Average: " + res[0] + ", Min: " + res[1] + ", Max: " + res[2]);
    }
}
