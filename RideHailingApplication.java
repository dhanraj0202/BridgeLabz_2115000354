import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Vehicle{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public double getRatePerKm(){
		return ratePerKm;
	}
}

interface GPS{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS{
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation(){
        return location;
    }

    @Override
    public void updateLocation(String newLocation){
        this.location = newLocation;
        System.out.println("Car's new location: " + location);
    }
}

class Bike extends Vehicle implements GPS{
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation(){
        return location;
    }

    @Override
    public void updateLocation(String newLocation){
        this.location = newLocation;
        System.out.println("Bike's new location: " + location);
    }
}

class Auto extends Vehicle implements GPS{
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation(){
        return location;
    }

    @Override
    public void updateLocation(String newLocation){
        this.location = newLocation;
        System.out.println("Auto's new location: " + location);
    }
}

public class RideHailingApplication{
    public static void main(String[] args){
        List<Vehicle> rides = new ArrayList<>();

        Car car1 = new Car("C001", "Dhanraj", 2.5);
        Bike bike1 = new Bike("B001", "Aryan", 1.2);
        Auto auto1 = new Auto("A001", "Nikhil", 1.8);

        rides.add(car1);
        rides.add(bike1);
        rides.add(auto1);

        Random rand = new Random();
        double distance = 5 + (rand.nextDouble() * 15);

        for(Vehicle ride : rides){
            ride.getVehicleDetails();
            System.out.println("Ride Distance: " + String.format("%.2f", distance) + " km");
            System.out.println("Total Fare: " + String.format("%.2f", ride.calculateFare(distance)));
            System.out.println();
        }

        car1.updateLocation("Hodal");
        bike1.updateLocation("Palwal");
        auto1.updateLocation("Mathura");

        System.out.println("\nCurrent Vehicle Locations:");
        System.out.println("Car Location: " + car1.getCurrentLocation());
        System.out.println("Bike Location: " + bike1.getCurrentLocation());
        System.out.println("Auto Location: " + auto1.getCurrentLocation());
    }
}
