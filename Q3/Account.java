//Write a program using inheritance to create class called Account as a base
//class, write two derived classes called SavingsAccount and CurrentAccount.
//        A SavingsAccount object, in addition to the attributes of an Account object, should
//        have an interest variable and a Interest method which adds interest to the account.
//        A CurrentAccount should also have an overridden Interest method to calculate
//        interest in current account.
package Q3;

public class Account {
    private int accountNo;
    private double balance;
    private int years;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
class SavingsAccount extends Account{
    private double interest;
    public void setInterest(){
        interest=getBalance()*4*getYears()/100;
    }
    public double getInterest(){
        return interest;
    }
}
class CurrentAccount extends SavingsAccount{
    public void setInterest(){
        setInterest();
    }
}
