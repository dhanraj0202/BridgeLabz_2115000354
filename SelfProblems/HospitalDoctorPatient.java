import java.util.ArrayList;
import java.util.List;

class Doctor{
    private String name;
    private List<Patient> patients;

    public Doctor(String name){
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void consult(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public void displayPatients(){
        System.out.println("Doctor: " + name + " - Patients:");
        for(Patient patient : patients){
            System.out.println(patient.getName());
        }
    }
}

class Patient{
    private String name;
    private List<Doctor> doctors;

    public Patient(String name){
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addDoctor(Doctor doctor){
        if(!doctors.contains(doctor)){
            doctors.add(doctor);
        }
    }

    public void viewDoctors(){
        System.out.println("Patient: " + name + " - Consulted Doctors:");
        for(Doctor doctor : doctors){
			System.out.println(doctor.getName());
        }
    }
}

class Hospital{
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name){
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void displayHospitalDetails(){
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for(Doctor doctor : doctors){
            System.out.println(doctor.getName());
        }
        System.out.println("Patients:");
        for(Patient patient : patients){
            System.out.println(patient.getName());
        }
    }
}

public class HospitalDoctorPatient{
    public static void main(String[] args){
        Hospital hospital = new Hospital("KD Dental");

        Doctor doctor1 = new Doctor("Dr. Dhanraj");
        Doctor doctor2 = new Doctor("Dr. Rahul");

        Patient patient1 = new Patient("Aryan");
        Patient patient2 = new Patient("Nitin");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        hospital.displayHospitalDetails();

        doctor1.displayPatients();
        doctor2.displayPatients();

        patient1.viewDoctors();
        patient2.viewDoctors();
    }
}
