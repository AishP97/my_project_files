package Encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount(100.00);
        bk.deposit(200);
        bk.withdraw(500);
    }
    
}
