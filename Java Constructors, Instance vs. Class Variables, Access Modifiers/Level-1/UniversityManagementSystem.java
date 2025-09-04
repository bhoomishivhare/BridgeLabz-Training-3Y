class Student {
    public int rollNumber;     // public
    protected String name;     // protected
    private double CGPA;       // private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass to demonstrate protected
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String name, double cgpa, String specialization) {
        super(roll, name, cgpa);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}
