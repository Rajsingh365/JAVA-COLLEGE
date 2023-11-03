package Q19;
import java.util.Scanner;
abstract class Vehicle{
    private String make;
    private String model;
    private int year;
    private String fuelType;
    public Vehicle(String make, String model, int year, String fuelType){
        this.make=make;
        this.model=model;
        this.year=year;
        this.fuelType=fuelType;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getFuelType(){
        return fuelType;
    }
    abstract public double getFuelEfficiency(double distance, double gallonsOfFuelUsed);
    abstract public double getDistanceTravelled(double distance);
    abstract public double getMaxSpeed(double speed);
}
class Truck extends Vehicle{
        public Truck(String make, String model, int year, String fuelType){
            super(make, model, year, fuelType);
        }
        public double getFuelEfficiency(double distance, double gallonsOfFuelUsed){
            try{
                return getDistanceTravelled(distance)/ gallonsOfFuelUsed;
            }
            catch (ArithmeticException e){
                System.out.println("Error: No. of Gallons used must be greater than 0");
                return 0;
            }
        }
        public double getDistanceTravelled(double distance){
            return distance;
        }
        public double getMaxSpeed(double speed){
            return speed;
        }
}
class Car extends Vehicle{
    public Car(String make, String model, int year, String fuelType){
        super(make, model, year, fuelType);
    }
    public double getFuelEfficiency(double distance, double gallonsOfFuelUsed){
        try{
            return getDistanceTravelled(distance)/ gallonsOfFuelUsed;
        }
        catch (ArithmeticException e){
            System.out.println("Error: No. of Gallons used must be greater than 0");
            return 0;
        }
    }
    public double getDistanceTravelled(double distance){
        return distance;
    }
    public double getMaxSpeed(double speed){
        return speed;
    }
}
class MotorCycle extends Vehicle{
    public MotorCycle(String make, String model, int year, String fuelType){
        super(make, model, year, fuelType);
    }
    public double getFuelEfficiency(double distance, double gallonsOfFuelUsed){
        try{
            return getDistanceTravelled(distance)/ gallonsOfFuelUsed;
        }
        catch (ArithmeticException e){
            System.out.println("Error: No. of Gallons used must be greater than 0");
            return 0;
        }
    }
    public double getDistanceTravelled(double distance){
        return distance;
    }
    public double getMaxSpeed(double speed){
        return speed;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String make,model,fuelType;
        int years;
        System.out.println("Enter make: ");
        make=sc.nextLine();
        System.out.println("Enter model no. of car: ");
        model=sc.nextLine();
        System.out.println("Enter no. of years, Car has been used: ");
        years=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter FuelType: ");
        fuelType=sc.nextLine();
        Car c = new Car(make,model,years,fuelType);
        double miles,gallons;
        System.out.println("Enter no. of miles travelled: ");
        miles=sc.nextDouble();
        System.out.println("Enter no. of gallons of fuel consumed: ");
        gallons= sc.nextDouble();
        System.out.println("Enter the max speed of your car(in km/h): ");
        System.out.println("Max Speed: "+c.getMaxSpeed(sc.nextDouble())+" km/h");
        System.out.println("Fuel Efficiency: " +((c.getFuelEfficiency(miles,gallons))+" MPG"));
    }
}