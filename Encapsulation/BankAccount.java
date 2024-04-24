package Encapsulation;

public class BankAccount{
    private double balance;
    double intialBalance;
    double amount;

    BankAccount(double intialBalance){
        if(intialBalance > 0){
            balance = intialBalance;
        }
        else{
            balance = 0;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount + "Total new balance is :" + balance);
        }
        else{
            System.out.println("Please deposit any amount greater than $1");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn :" + amount + " Total new balance is :" + balance);
        }
        else if(amount > balance){
            System.out.println("Insufficient balance ! ");
        }
        else{
            System.out.println("Cannot withdraw a negative amount");
        }
    }
}