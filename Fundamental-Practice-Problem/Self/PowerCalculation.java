import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Exponent: ");
        double exponent = sc.nextDouble();
        double res = Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + res);
        sc.close();
    }
}
