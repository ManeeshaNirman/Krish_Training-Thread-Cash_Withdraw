package model;

public class BankAccount {

    private int balance=50000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int withdraw) {
        this.balance = balance-withdraw;
    }
}
