package Q6;

import java.util.Scanner;

public class Area {
    public double area(double length, double breadth){
        return length*breadth;
    }
    public double area(double side){
        return Math.pow(side,2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Area a = new Area();
        double length,breadth,side;
        System.out.println("Enter the length and breadth of rectangle: ");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        System.out.println("Area of Rectangle: "+a.area(length,breadth));

        System.out.println("Enter the side of square: ");
        side=sc.nextDouble();
        System.out.println("Area of square: "+a.area(side));
    }
}
