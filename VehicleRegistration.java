class Vehicle{
	String ownerName;
	String vehicleType;
	static int registrationFee;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}

	void displayVehicleDetails(){
		System.out.println("Registration Fee: " + registrationFee);
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
	}
	
	static void updateRegistrationFee(int newRegistrationFee){
		registrationFee = newRegistrationFee;
	}
}
public class VehicleRegistration{
	public static void main(String[] args){
		Vehicle.updateRegistrationFee(3500);
		
		Vehicle owner1 = new Vehicle("Dhanraj", "SUV");
		Vehicle owner2 = new Vehicle("Rahul", "Sedan");
		owner1.displayVehicleDetails();
		owner2.displayVehicleDetails();
	
	}
}