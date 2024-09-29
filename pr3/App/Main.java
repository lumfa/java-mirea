import com.company.vehicles.Car;
import com.company.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
//        Car emptyObj = new Car();//        
//        Car firstCarObj = new Car("mustang", "am777r", "red", 2020);
//        Car secondObj = new Car("granta", 2018);//
//        System.out.println(firstCarObj.getColor());//
//        firstCarObj.setColor("black");//        System.out.println(firstCarObj.getColor());
////        firstCarObj.To_String();
////        System.out.println(firstCarObj.carYearCalc());
////        System.out.println("\n");
////        secondObj.To_String();
      
      Car car = new Car();        
      ElectricCar electricCar = new ElectricCar("bob", 14589200, 10000);
      car.setOwnerName("little bob");
      electricCar.setOwnerName("big bob");        
      electricCar.setInsuranceNumber(1234);
      electricCar.setBatteryCapacity(10000);
      System.out.println("car: ");        
      car.To_String();
      System.out.println("el car: ");        
      electricCar.To_String();
    }
}
