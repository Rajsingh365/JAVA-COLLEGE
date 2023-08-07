import java.io.*;
import java.util.Scanner;
public class MaxOFThree {
    public static void main(String []args){
        Max m1=new Max();
        m1.getData();
        System.out.println("Greatest Number is "+ m1.compareMaxOfThree());
    }
}
class Max{
    int n1,n2,n3;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        n1=sc.nextInt();
        System.out.println("Enter the Second Number : ");
        n2=sc.nextInt();
        System.out.println("Enter the Third Number : ");
        n3=sc.nextInt();
    }
    int compareMaxOfThree(){
        return n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
    }
}
