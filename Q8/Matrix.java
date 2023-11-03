package Q8;

import java.util.Scanner;

public class Matrix {
    public static void input(int [][]mat) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the value of Matrix["+(i+1)+"]["+(j+1)+"]");
                mat[i][j]=sc.nextInt();
            }
    }
    public static void display(int mat[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void addition(int [][]mat1, int [][]mat2){
        int [][]mat= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        display(mat);
    }
    public static void subtraction(int [][]mat1, int [][]mat2){
        int [][]mat= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=mat1[i][j]-mat2[i][j];
            }
        }
        display(mat);
    }
    public static void multiplication(int [][]mat1,int [][]mat2){
        int [][]mat= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    mat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        display(mat);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]mat1= new int[3][3];
        int [][]mat2 = new int[3][3];
        int option;
        System.out.println("Enter the Element of 1st matrix (Row by Row) ");
        input(mat1);
        System.out.println("Enter the Element of 2nd matrix (Row by Row) ");
        input(mat2);
        while(true){
            System.out.println("Enter your Choice: ");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Exit ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    addition(mat1, mat2);
                    break;
                case 2:
                    subtraction(mat1, mat2);
                    break;
                case 3:
                    multiplication(mat1, mat2);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
