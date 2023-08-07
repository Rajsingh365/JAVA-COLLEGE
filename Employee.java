import java.io.*;
import java.util.Scanner;

public class Employee {
    String name,id,designation,department;
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter Employee ID : ");
        id=sc.nextLine();
        System.out.println("Enter Employee Designation : ");
        designation=sc.nextLine();
        System.out.println("Enter Employee Department : ");
        department=sc.nextLine();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+ id);
        System.out.println("Designation : "+ designation);
        System.out.println("Department : "+ department);
    }
    public static void main(String []args){
        Employee emp=new Employee();
        emp.read();
        emp.display();
    }
}
