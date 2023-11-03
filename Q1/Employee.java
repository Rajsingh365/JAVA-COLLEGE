//Write a program using constructors and methods that would print the information (name, year of joining, salary, address) of employees by creating a
//class named 'Employee'. Also add Exceptions for verification of data. The output should be as follows:
package Q1;

import java.util.Scanner;

public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;
    Employee(){

    }
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    {
        name="Anonymous";
        yearOfJoining=0;
        salary=0;
        address="Unknown";
    }
    public static void input(Employee[] e){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<e.length;i++) {
            try{
                System.out.println("Enter Your Name: ");
                String name= sc.nextLine();
                System.out.println("Enter Year of Joining: ");
                int yearOfJoining = sc.nextInt();
                System.out.println("Enter Your Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter your address: ");
                String address = sc.nextLine();
                if(yearOfJoining<1900) {
                    throw new IllegalArgumentException("Invalid year of joining");
                }
                if(salary<0) {
                    throw new IllegalArgumentException("Salary cannot be less than 0");
                }
                e[i]=new Employee(name,yearOfJoining,salary,address);
            }
            catch(Exception ex){
                System.out.println("Error: "+ ex.getMessage());
                e[i]=new Employee();
            }
        }
    }
    public static void display(Employee []e){
        System.out.println("Name    Year of Joining    Address");
        for(int i=0;i<e.length;i++) {
            System.out.println(e[i].name+"   "+e[i  ].yearOfJoining+"   "+e[i].address);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of Employee: ");
        n=sc.nextInt();
        Employee []arr= new Employee[n];
        input(arr);
        display(arr);
    }
}
