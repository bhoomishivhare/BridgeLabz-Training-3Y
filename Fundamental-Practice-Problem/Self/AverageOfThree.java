import java.util.Scanner;
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers separated by space: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
        sc.close();
    }
}
