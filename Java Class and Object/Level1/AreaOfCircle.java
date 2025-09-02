class Circle {
    double radius;

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;

        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
    }
}
