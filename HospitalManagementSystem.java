class Patient{
	static String hospitalName = "KD";
	private String name;
	private int age;
	private String ailment;
	final int patientID;
	static int totalPatients;
	
	static void getTotalPatients(){
		System.out.println("Total Patients: " + totalPatients);
	}
	
	Patient(String name, int age, String ailment, int patientID){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientID;
		totalPatients++;
	}
	
	void displayPatientDetails(){
		if(this instanceof Patient){
			System.out.println("Hospital Name: " + this.hospitalName);
			System.out.println("Name: " + this.name);
			System.out.println("Age: " + this.age);
			System.out.println("Ailment: " + this.ailment);
			System.out.println("Patient ID: " + this.patientID);
		}
	}
}
public class HospitalManagementSystem{
	public static void main(String[] args){
		Patient patient1 = new Patient("Dhanraj", 23, "Cough", 2115000354);
		patient1.displayPatientDetails();
		Patient.getTotalPatients();
	}
}