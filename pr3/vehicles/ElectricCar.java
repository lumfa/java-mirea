package org.example.Vehicles;


public class ElectricCar extends Car {
    private int batteryCapacity;
    public ElectricCar() {
        super();
        this.engineType = "electric";
        this.batteryCapacity = 0;
    }

    public ElectricCar(String ownerName, int insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() { return this.batteryCapacity; }

    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    @Override
    public void To_String() {
        System.out.printf("%s %s %d %s %d %s %d %s\n", getColor(), getLicense(), getYear(), getModel(), getBatteryCapacity(), getOwnerName(), getInsuranceNumber(), getEngineType());
    }
}
