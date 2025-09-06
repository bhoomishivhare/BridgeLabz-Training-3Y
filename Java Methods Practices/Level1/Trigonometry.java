import java.util.Scanner;

public class Trigonometry {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + res[0] + ", Cosine: " + res[1] + ", Tangent: " + res[2]);
    }
}
