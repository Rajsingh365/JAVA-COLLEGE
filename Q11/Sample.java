package Q11;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.circleInput(sc);
        System.out.println("Area of Circle: "+c.area()+", Perimeter of Circle: "+c.perimeter());

        Rectangle r = new Rectangle();
        r.rectangleInput(sc);
        System.out.println("Area of Rectangle: "+r.area()+", Perimeter of Rectangle: "+r.perimeter());
    }
}
interface Shape{
    double area();
    double perimeter();
}
class Circle implements Shape{
    private double radius;
    {
        radius=0;
    }

    public void circleInput(Scanner sc){
        try{
            System.out.println("Enter the value of Radius: ");
            if(!sc.hasNextDouble())
                throw new IllegalArgumentException("Sentence inputed ");
            radius = sc.nextDouble();
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public double perimeter(){
        return 2*3.1415*radius;
    }
}
class Rectangle implements Shape{
    private double length;
    private double breadth;
    {
        length=0;
        breadth=0;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public void rectangleInput(Scanner sc){
        try {
            System.out.println("Enter the length: ");
            length=sc.nextDouble();
            System.out.println("Enter the Breadth: ");
            breadth=sc.nextDouble();
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
