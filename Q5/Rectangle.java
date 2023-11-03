package Q5;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(){
        length=0;
        breadth=0;
    }
    public Rectangle(double side){
        length=side;
        breadth=side;
    }

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length,breadth;
        System.out.println("Enter the length of rectangle: ");
        length=sc.nextDouble();
        System.out.println("Enter the Breadth of rectangle: ");
        breadth=sc.nextDouble();
        Rectangle a= new Rectangle(length,breadth);
        System.out.println("Area of Rectangle with Length: "+length+" and breadth: "+breadth+" = "+a.getArea());
    }
}







