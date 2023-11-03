package Q18;

import java.util.Scanner;

class Shape {
    public double getPerimeter(){
        return 0;
    }
    public double getArea(){
        return 0;
    }
}
class Circle extends Shape{
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
public class Main{
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of circle: ");
        c.setRadius(sc.nextDouble());
        System.out.println("Area: "+c.getArea());
        System.out.println("Perimeter: "+c.getPerimeter());
    }
}
