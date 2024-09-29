
public class Main
{
 public static void main(String[] args) {
     
     Car emptyObj = new Car();
     Car firstCarObj = new Car("mustang", "am777r", "red", 2020);
     Car secondObj = new Car("granta", 2018);
     
     System.out.println(firstCarObj.getColor());
     
     firstCarObj.setColor("black");
     System.out.println(firstCarObj.getColor());
     
     firstCarObj.To_String();
     
     System.out.println(firstCarObj.carYearCalc());
     
     System.out.println("\n");
     
     secondObj.To_String();

  System.out.println("Hello World");
 }
}
