package org.example.vehicles;

public class ElectricCar extends Car {
    public double batteryCapacity;

    public ElectricCar(String model,
                       String license,
                       String color,
                       int year,
                       String ownerName,
                       int insuranceNumber,
                       double batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        setEngineType("Electric");
    }

    public ElectricCar() {}

    @Override
    public String vehicleType() {
        return "ElectricCar";
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void To_String() {
        System.out.printf("Color: %s " +
                        "\nLicense: %s " +
                        "\nYear: %d " +
                        "\nModel: %s " +
                        "\nInsurance number: %d " +
                        "\nOwner name: %s " +
                        "\nEngine type: %s " +
                        "\nBattery capacity: %,.3f\n\n",
                getColor(),
                getLicense(),
                getYear(),
                getModel(),
                getInsuranceNumber(),
                getOwnerName(),
                getEngineType(),
                getBatteryCapacity());
    }
}
