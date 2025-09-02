class Employee {
    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Aditya";
        e1.id = 101;
        e1.salary = 55000;

        e1.displayDetails();
    }
}
