package org.example.vehicles;

import java.time.Year;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber = 0;
    protected String engineType;

    public abstract String vehicleType();

    public Vehicle(String model, String license, String color, int year, String ownerName, int insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public Vehicle() { }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int carYearCalc() {
        // current year - car year
        return Year.now().getValue() - getYear();
    }

    public void To_String() {
        System.out.printf("Color: %s " +
                        "\nLicense: %s " +
                        "\nYear: %d " +
                        "\nModel: %s " +
                        "\nInsurance number: %d " +
                        "\nOwner name: %s " +
                        "\nEngine type: %s\n\n",
                getColor(),
                getLicense(),
                getYear(),
                getModel(),
                getInsuranceNumber(),
                getOwnerName(),
                getEngineType());
    }
}
