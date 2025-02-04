class Vehicle{
	static int registrationFee = 2000;
	private String ownerName;
	private String vehicleType;
	final int registrationNumber;
	
	Vehicle(String ownerName, String vehicleType, int registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}
	
	static void updateRegistrationFee(int newRegistrationFee){
		registrationFee = newRegistrationFee;
		System.out.println("Updated Registration Fee: " + registrationFee);
	}
	
	void displayRegistrationDetails(){
		if(this instanceof Vehicle){
			System.out.println("Owner Name: " + ownerName);
			System.out.println("Vehicle Type: " + vehicleType);
			System.out.println("Registration Number: " + registrationNumber);
			System.out.println("Registration Fee: " + registrationFee);
		}
	}
}

public class VehicleRegistrationSystem{
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Dhanraj", "SUV", 2115000354);
		vehicle1.displayRegistrationDetails();
		Vehicle.updateRegistrationFee(2500);
	}
}