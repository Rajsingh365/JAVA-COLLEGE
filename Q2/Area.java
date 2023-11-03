//Write a program to print the area of a rectangle by creating a class named
//'Area' taking the values of its length and breadth as parameters of its constructor
//        and having a method named 'returnArea' which returns the area of the rectangle.
//        Length and breadth of rectangle are entered through keyboard.
package Q2;

import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;
    public Area(){
        length=0;
        breadth=0;
    }
    public Area(double side){
        length=side;
        breadth=side;
    }

    public Area(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            double length, breadth;
            System.out.println("Enter the length of rectangle: ");
            length = sc.nextDouble();
            System.out.println("Enter the Breadth of rectangle: ");
            breadth = sc.nextDouble();
            Area a = new Area(length, breadth);
            System.out.println("Area of Rectangle with Length: " + length + " and breadth: " + breadth + " = " + a.getArea());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input !!!! Please Enter A valid Length And Breadth");
        }
    }
}
