package Q4;

import java.util.Scanner;

public class Student {
    private int rollno;
    public void putRoll(int rollno){
        this.rollno=rollno;
    }
    public int getRollno(){
        return rollno;
    }
}
class Marks extends Student{
    private float marks;
    public void putMarks(float marks){
        this.marks=marks;
    }
    public float getMarks(){
        return marks;
    }
}
class Sports extends Marks{
    private float score;
    public void putScore(float score){
        this.score=score;
    }
    public float getScore() {
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sports obj = new Sports();
        System.out.println("Enter your roll no.: ");
        obj.putRoll(sc.nextInt());
        System.out.println("Enter your marks: ");
        obj.putMarks(sc.nextFloat());
        System.out.println("Enter your score: ");
        obj.putScore(sc.nextFloat());
        System.out.println("Roll no.: "+obj.getRollno()+", Marks: "+obj.getMarks()+", Score: "+obj.getScore());
    }
}
