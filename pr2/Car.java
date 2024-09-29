import java.time.Year;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }
    
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public Car() {}
    
    // Getters and setters
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
    
    public void To_String() {
        System.out.printf("%s %s %d %s\n", color, license, year, model);
    }
    
    public int carYearCalc() {
        // current year - car year
        return Year.now().getValue() - year;
    }
    
}
