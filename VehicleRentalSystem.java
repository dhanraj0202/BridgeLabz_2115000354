import java.util.ArrayList;
import java.util.List;

abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicleDetails(int days, double insuranceCost){
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
        System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
        System.out.println("Insurance Cost: " + insuranceCost);
        System.out.println("Total Cost: " + (calculateRentalCost(days) + insuranceCost));
    }

    public double getRentalRate(){
		return rentalRate;
	}
}

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE = 50;

    public Car(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(){
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails(){
        return "Car Insurance: " + INSURANCE_RATE;
    }
}

class Bike extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE = 20;

    public Bike(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(){
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails(){
        return "Bike Insurance: " + INSURANCE_RATE;
    }
}

class Truck extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE = 100;

    public Truck(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance(){
        return INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails(){
        return "Truck Insurance: " + INSURANCE_RATE;
    }
}

public class VehicleRentalSystem{
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("123", 40);
        Bike bike1 = new Bike("789", 15);
        Truck truck1 = new Truck("456", 80);

        vehicles.add(car1);
        vehicles.add(bike1);
        vehicles.add(truck1);

        int rentalDays = 5;

        for(Vehicle vehicle : vehicles){
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;
            vehicle.displayVehicleDetails(rentalDays, insuranceCost);
            if(vehicle instanceof Insurable){
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}