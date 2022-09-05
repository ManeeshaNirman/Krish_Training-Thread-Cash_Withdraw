package model;

public class Application {

    public static void main(String[] args) {

        BankAccount account=new BankAccount();
        AccountHolder holder=new AccountHolder(account);
        Thread maneesha=new Thread(holder);
        Thread kavee=new Thread(holder);

        maneesha.setName("Maneesha");
        kavee.setName("Kavindya");

        maneesha.start();
        kavee.start();

    }

}
