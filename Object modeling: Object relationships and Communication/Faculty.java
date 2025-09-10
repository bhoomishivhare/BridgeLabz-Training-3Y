import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) { this.name = name; }
    public void display() { System.out.println("Faculty: " + name); }
}

class Department {
    private String name;

    public Department(String name) { this.name = name; }
    public void display() { System.out.println("Department: " + name); }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) { this.name = name; }

    public void addDepartment(Department d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }

    public void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) d.display();
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.display();
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        uni.addDepartment(new Department("Computer Science"));
        uni.addDepartment(new Department("Electronics"));

        Faculty f1 = new Faculty("Prof. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
    }
}
