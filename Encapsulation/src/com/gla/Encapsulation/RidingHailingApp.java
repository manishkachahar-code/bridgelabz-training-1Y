package com.gla.Encapsulation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = initialLocation;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void setDriverName(String name) { this.driverName = name; }
    public void setRatePerKm(double rate) { this.ratePerKm = rate; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("\nVehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
        System.out.println("-------------------------");
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println(driverName + "'s vehicle location updated to: " + newLocation);
    }
}

class Car extends Vehicle {
    private double carSurcharge = 50; // fixed surcharge for cars

    public Car(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + carSurcharge;
    }
}

class Bike extends Vehicle {
    public Bike(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no surcharge
    }
}
class Auto extends Vehicle {
    private double autoSurcharge = 20;

    public Auto(String id, String driver, double rate, String location) {
        super(id, driver, rate, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + autoSurcharge;
    }
}

public class RidingHailingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nVehicle " + (i + 1));
            System.out.print("Enter Vehicle ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Driver Name: ");
            String driver = sc.nextLine();
            System.out.print("Enter Rate per Km: ");
            double rate = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Enter Initial Location: ");
            String loc = sc.nextLine();

            System.out.print("Enter Type (1=Car, 2=Bike, 3=Auto): ");
            int type = sc.nextInt();
            sc.nextLine();

            Vehicle v;
            switch (type) {
                case 1:
                    v = new Car(id, driver, rate, loc);
                    break;
                case 2:
                    v = new Bike(id, driver, rate, loc);
                    break;
                case 3:
                    v = new Auto(id, driver, rate, loc);
                    break;
                default:
                    System.out.println("Invalid type, defaulting to Car");
                    v = new Car(id, driver, rate, loc);
            }

            vehicles.add(v);
        }

        System.out.println("\n===== Vehicle Details =====");
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
        }

        System.out.println("\n===== Calculate Fares =====");
        for (Vehicle v : vehicles) {
            System.out.print("Enter distance to travel for " + v.getDriverName() + "'s vehicle: ");
            double distance = sc.nextDouble();
            double fare = v.calculateFare(distance);
            System.out.printf("Fare for %s (%s): %.2f\n", v.getDriverName(), v.getVehicleId(), fare);
        }

        System.out.println("\n===== Update Vehicle Locations =====");
        sc.nextLine();
        for (Vehicle v : vehicles) {
            System.out.print("Enter new location for " + v.getDriverName() + ": ");
            String newLoc = sc.nextLine();
            v.updateLocation(newLoc);
        }

        System.out.println("\n===== Updated Vehicle Details =====");
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
        }
    }



}
