package org.example.app;

import org.example.vehicles.Car;
import org.example.vehicles.ElectricCar;
import org.example.vehicles.Vehicle;

public class TestCar {
    public static void test() {
        Car car = new Car("lada granta sport", "am777r", "red", 2021, "little bob", 101011);
        ElectricCar electricCar = new ElectricCar("tesla", "aa111a", "white", 2022, "big bob", 123334, 100);

        car.setYear(2022);
        car.setOwnerName("middle bob");
        car.setInsuranceNumber(1235466);
        System.out.println("Vehicle Type: " + car.vehicleType());
        car.To_String();

        electricCar.setYear(2023);
        electricCar.setOwnerName("fake bob");
        electricCar.setInsuranceNumber(908342);
        System.out.println("Vehicle Type: " + electricCar.vehicleType());
        electricCar.To_String();
        System.out.println("Battery capacity: " + electricCar.getBatteryCapacity());
    }
}
