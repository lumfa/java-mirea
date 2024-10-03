package org.example.vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
        setEngineType("Combustion");
    }

    public Car() {}

    @Override
    public String vehicleType() {
        return "Car";
    }
}
