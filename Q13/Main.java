package Q13;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1(), "Thread 1");
        Thread t2 = new Thread(new MyThread2(), "Thread 2");
        t1.setPriority(5);
        t2.setPriority(10);

        System.out.println("Information of Thread 1: ");
        System.out.println("Name: "+t1.getName()+", Priority: "+t1.getPriority());

        System.out.println("Information of Thread 2: ");
        System.out.println("Name: "+t2.getName()+", Priority: "+t2.getPriority());
        t1.start();
        t2.start();
    }
}
class MyThread1 implements Runnable{
    public void run(){
//        System.out.println((Thread.currentThread().getName()));
        f1();
    }
    public void f1(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        f2();
    }
    public void f2(){
        for(int j=1;j<=10;j++){
            System.out.println("j="+j);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
}
