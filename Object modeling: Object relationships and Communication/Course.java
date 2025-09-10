import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) { this.name = name; }

    public void enrollStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public String getName() { return name; }

    public void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c);
        }
    }

    @Override
    public String toString() { return name; }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) { this.name = name; }

    public void addStudent(Student s) { students.add(s); }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("GLA");

        Student s1 = new Student("Bhoomi");
        Student s2 = new Student("Aarav");

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("Maths");
        Course c2 = new Course("Physics");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);

        school.showStudents();
        c2.showStudents();
    }
}
