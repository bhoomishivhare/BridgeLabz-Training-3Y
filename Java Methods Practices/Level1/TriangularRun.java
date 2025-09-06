import java.util.Scanner;

public class TriangularRun {

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // meters
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle (meters): ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        int rounds = calculateRounds(s1, s2, s3);
        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}
