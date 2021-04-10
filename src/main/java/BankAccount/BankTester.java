package BankAccount;

public class BankTester {
    public  static void main(String[]args){
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        BankAccount c = new BankAccount();

        System.out.println(a.getAccountNumber());
        System.out.println(b.getAccountNumber());
        System.out.println(c.getAccountNumber());
        a.depositIntoChecking(200.25);
        a.depositIntoSaving(3550.65);
        a.withdrawFromChecking(200.12);
        a.withdrawFromSaving(3551.00);
        System.out.println(a.displayTotalAmount());

    }
}
