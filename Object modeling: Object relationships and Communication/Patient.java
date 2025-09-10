import java.util.*;

class Patient {
    private String name;

    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
}

class Doctor {
    private String name;

    public Doctor(String name) { this.name = name; }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting Patient " + p.getName());
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) { this.name = name; }

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }

    public void showHospital() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors: " + doctors.size() + ", Patients: " + patients.size());
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo");

        Doctor d1 = new Doctor("Dr. Singh");
        Doctor d2 = new Doctor("Dr. Kapoor");

        Patient p1 = new Patient("Ananya");
        Patient p2 = new Patient("Rohan");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p2);
    }
}
