package BankAccount;

import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static  double totalAmount = 0.0;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberOfAccounts(int numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }

    public static double getTotalAmount() {
        return totalAmount;
    }

    public static void setTotalAmount(int totalAmount) {
        BankAccount.totalAmount = totalAmount;
    }

    public BankAccount(){
       this.accountNumber = BankAccount.generateAccountNumber();
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts ++;
        totalAmount ++;

    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    private static String generateAccountNumber(){
        String str = " ";
        Random r = new Random();
        for(int i=0; i < 10; i++){
            str += r.nextInt(10);
        }
        return str;

    }
    public void depositIntoChecking(double checkingBalance){

        this.checkingBalance = checkingBalance;
        totalAmount += checkingBalance;


    }
    public void depositIntoSaving(double savingsBalance){

        this.savingsBalance = savingsBalance;
        totalAmount += savingsBalance;

    }
    public void withdrawFromChecking(double amount){

        if(this.checkingBalance >= Double.valueOf(amount)){
            this.checkingBalance -= Double.valueOf(amount);
            System.out.println("Withdrawal: " + this.checkingBalance);


        }
        else{
            System.out.println("Insufficient funds. Please deposit to withdraw");
        }


        }
        public void  withdrawFromSaving(double amount){
            if(this.savingsBalance >= Double.valueOf(amount)){
                this.savingsBalance -= Double.valueOf(amount);
                System.out.println("Withdrawal: " + this.savingsBalance);
                totalAmount++;

            }
            else{
                System.out.println("Insufficient funds. Please deposit to withdraw");
            }


        }

        public  double displayTotalAmount(){
        totalAmount = savingsBalance + checkingBalance;

        return totalAmount;

    }



}
