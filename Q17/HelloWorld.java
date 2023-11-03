package Q17;

class HelloWorld {
    public static void main(String[] args) {
        Account acc = new Account();
        AddMoney a = new AddMoney(acc);
        DeductMoney d = new DeductMoney(acc);
        Thread t1 = new Thread(a,"Deposit Thread");
        Thread t2 = new Thread(d,"Withdrawal Thread");
        t1.start();
        t2.start();
//        t1.stop();
//        t2.stop();
        System.out.println("Final Balance: " +(acc.getBalance()));
    }
}
class Account{
    private double balance=1000;
    private boolean setFlag=false;

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount){
        while(setFlag){
            try{wait();} catch(Exception e){e.printStackTrace();}
        }
        balance+=amount;
        setFlag=true;
        System.out.println("Deposited Amount: "+amount+", Balance: "+balance);
        notify();
    }
    public synchronized void withdrawal(int amount){
        while(!setFlag){
            try{wait();} catch(Exception e){ e.printStackTrace(); }
        }
        if(balance<amount)
            throw new IllegalArgumentException("Insufficient Balance");
        balance-=amount;
        setFlag=false;
        System.out.println("Withdrawn: "+amount+", Balance: "+balance);
        notify();
    }
}
class AddMoney implements Runnable {
    Account acc;
    public AddMoney(Account acc){
        this.acc=acc;
    }
    public void run(){
        for(int i=1;i<=3;i++){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter amount to deposit: ");
//            int amt=sc.nextInt();
            acc.deposit(200);
        }
    }
}
class DeductMoney implements Runnable {
    Account acc;
    public DeductMoney(Account acc){
        this.acc=acc;
    }
    public void run(){
        for(int i=1;i<=3;i++){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter amount to withdraw: ");
//            int amt=sc.nextInt();
            acc.withdrawal(100);
        }
    }
}