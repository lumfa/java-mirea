package org.example.Vehicles;

import java.time.Year;


public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    protected String engineType = "fuel";
    private String ownerName;
    private int insuranceNumber = 0;



    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car(String model, int year) {
        this.model = model;        this.year = year;
    }

    public Car(String ownerName, int insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public Car() { }
    // Getters and setters
    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getLicense() { return license; }

    public void setLicense(String license) { this.license = license; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public void To_String() { System.out.printf("%s %s %d %s %d %s %s\n", color, license, year, model, insuranceNumber, ownerName, getEngineType()); }

    public String getEngineType() { return engineType; }

    public void setEngineType(String engineType) { this.engineType = engineType; }

    public String getOwnerName() { return ownerName; }

    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public int getInsuranceNumber() { return insuranceNumber; }

    public void setInsuranceNumber(int insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public int carYearCalc() {
        // current year - car year
        return Year.now().getValue() - year;
    }
}
