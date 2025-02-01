public class CarRental{
	private String customerName;
	private int carModel;
	private int rentalDays;
	
	CarRental(String customerName, int carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	void displayCostDetails(){
		System.out.println("Customer Name: " + customerName);
		System.out.println("Car Model: " + carModel);
		System.out.println("Rental Days: " + rentalDays);
		System.out.println("Total Cost: " + 2000*rentalDays);
	}
	
	public static void main(String[] args){
		CarRental car1 = new CarRental("Dhanraj", 2019, 5);
		car1.displayCostDetails();
	}
}