import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleID;
    private String model;
    private double rentalRate;

    public Vehicle(String vehicleID, String model, double rentalRate) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract void displayVehicleInfo();
}

class Car extends Vehicle {
    private int doors;

    public Car(String vehicleID, String model, double rentalRate, int doors) {
        super(vehicleID, model, rentalRate);
        this.doors = doors;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Car ID: " + getVehicleID() + ", Model: " + getModel() + ", Rental Rate: Rs" + getRentalRate() + ", Doors: " + doors);
    }
}

class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String vehicleID, String model, double rentalRate, boolean hasCarrier) {
        super(vehicleID, model, rentalRate);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Bike ID: " + getVehicleID() + ", Model: " + getModel() + ", Rental Rate: Rs" + getRentalRate() + ", Has Carrier: " + hasCarrier);
    }
}

class Customer {
    private String customerID;
    private String name;

    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }
}

class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public Rental(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalRent() {
        return vehicle.getRentalRate() * rentalDays;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customer.getName() + " (" + customer.getCustomerID() + ")");
        vehicle.displayVehicleInfo();
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rent: Rs" + calculateTotalRent());
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Toyota Corolla", 500, 4);
        Vehicle bike = new Bike("B001", "Yamaha R15", 200, true);

        Customer customer = new Customer("CUST01", "John Doe");

        Rental carRental = new Rental(car, customer, 3);
        Rental bikeRental = new Rental(bike, customer, 2);

        System.out.println("Car Rental Details:");
        carRental.displayRentalDetails();
        System.out.println();

        System.out.println("Bike Rental Details:");
        bikeRental.displayRentalDetails();
    }
}
