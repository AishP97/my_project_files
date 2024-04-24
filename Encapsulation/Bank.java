package Encapsulation;

public class Bank {
    private String accountNumber;
    private double balance;

    Bank(String accountNumber){
       this.accountNumber = accountNumber;
    }

    public String getaccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
}
