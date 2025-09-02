class Student {
    String name;
    int rollNumber;
    double marks;
    String grade;

    // Method to calculate grade
    void calculateGrade() {
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B";
        else if (marks >= 60) grade = "C";
        else grade = "F";
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.rollNumber = 101;
        s1.marks = 85;

        s1.calculateGrade();
        s1.displayDetails();
    }
}
