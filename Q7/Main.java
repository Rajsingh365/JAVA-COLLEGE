package Q7;

import java.util.Scanner;

class Member {
    protected String name;
    protected int age;
    protected String phoneNo;
    protected String address;
    protected double salary;
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
    public Member(String name,int age, String phoneNo,String address, double salary){
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.address=address;
        this.salary=salary;
    }

}
class Employee extends Member{
    private String specialization;
    Employee(String name, int age, String phoneNo, String address, double salary,String specialization){
        super(name,age,phoneNo,address,salary);
        this.specialization=specialization;
    }
    public static void input(Scanner sc){
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Your Salary");
        double salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNo=sc.nextLine();
        System.out.println("Enter your Address: ");
        String address=sc.nextLine();
        System.out.println("Enter your specialization: ");
        String specialization=(sc.nextLine());
        Employee e = new Employee(name,age,phoneNo,address,salary,specialization);
        e.display();
    }
    public void display(){
        System.out.println("Employee Details: ");
        System.out.println("Name: "+name+", Age: "+age+", Salary: "+salary+", Phone Number: "+phoneNo+", Address: "+address+", Specialization: "+specialization);
    }
}
class Manager extends Member{
    private String department;
    String getDepartment(){
        return department;
    }
    Manager(String name, int age, String phoneNo, String address, double salary,String department){
        super(name,age,phoneNo,address,salary);
        this.department=department;
    }
    public static void input(Scanner sc){
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Your Salary");
        double salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNo=sc.nextLine();
        System.out.println("Enter your Address: ");
        String address=sc.nextLine();
        System.out.println("Enter your specialization: ");
        String department=(sc.nextLine());
        Manager m = new Manager(name,age,phoneNo,address,salary,department);
        m.display();
    }
    public void display(){
        System.out.println("Manager Details: ");
        System.out.println("Name: "+name+", Age: "+age+", Salary: "+salary+", Phone Number: "+phoneNo+", Address: "+address+",  Department: "+department);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Manager.input(sc);
        Employee.input(sc);
    }
}
