package Q12;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandle {
    public void divideByZero(){
        try{
            int a=1, b=0;
            System.out.println("Result: " + a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void arrayIndexOutOfBounds(Scanner sc){
        int a[]=new int[5];
        try {
            for (int i=0;i<=a.length;i++) {
                System.out.println("Enter an Element: ");
                a[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
    public void numberFormatException(){
        try{
            String s = "RAJ";
            int value = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void InputOutputexception(Scanner sc) throws IOException{

        int a;
        System.out.println("Enter a number: ");
        if(!sc.hasNextInt())
            throw new IOException("INPUT OUTPUT EXCEPTION");
        a=sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ExceptionHandle e = new ExceptionHandle();
//        e.divideByZero();
//        e.arrayIndexOutOfBounds(sc);
//        e.numberFormatException();
        try {
            e.InputOutputexception(sc);
        }
        catch (IOException ex) {
            System.err.println("d) IO Exception: " + ex.getMessage());
        }
    }

}
