import java.util.ArrayList;
import java.util.List;

abstract class Patient{
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public void getPatientDetails(){
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: ");
        System.out.println("Total Bill: " + calculateBill());
    }

    public String getPatientId(){
        return patientId;
    }

    public String getName(){
        return name;
    }
}

interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate){
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill(){
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record){
        records.add(record);
        System.out.println("Medical record added for InPatient: " + getName());
    }

    @Override
    public void viewRecords(){
        System.out.println("Medical Records for " + getName() + ":");
        for(String record : records){
            System.out.println("- " + record);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee){
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill(){
        return consultationFee;
    }

    @Override
    public void addRecord(String record){
        records.add(record);
        System.out.println("Medical record added for OutPatient: " + getName());
    }

    @Override
    public void viewRecords(){
        System.out.println("Medical Records for " + getName() + ":");
        for(String record : records){
            System.out.println("- " + record);
        }
    }
}

public class HospitalPatientManagement{
    public static void main(String[] args){
        List<Patient> patients = new ArrayList<>();

        InPatient patient1 = new InPatient("P001", "Dhanraj", 45, "Pneumonia", 5, 250);
        OutPatient patient2 = new OutPatient("P002", "Aryan", 30, "Typhoid", 100);

        patients.add(patient1);
        patients.add(patient2);

        for(Patient patient : patients){
            patient.getPatientDetails();
            System.out.println();
        }

        patient1.addRecord("Admitted on 5th Feb.");
        patient1.addRecord("Prescribed antibiotics.");
        patient1.viewRecords();

        patient2.addRecord("Consultation on 6th Feb.");
        patient2.addRecord("Prescribed antibiotics.");
        patient2.viewRecords();
    }
}