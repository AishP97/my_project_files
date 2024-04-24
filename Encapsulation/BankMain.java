package Encapsulation;

public class BankMain {
    public static void main(String[] args) {
        Bank bk = new Bank("5800900700");
        bk.setBalance(1000);

        System.out.println("Account Number is :" + bk.getaccountNumber() + " and balance is :" + bk.getBalance());
    }    
}
