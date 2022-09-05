package model;

public class AccountHolder implements Runnable{



    private BankAccount account;

    public AccountHolder(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i=1; i<=10; i++){

            withdraw(5000);

            if (account.getBalance()<0){
                System.out.println("No enought cash");
            }

        }

    }

    private synchronized void withdraw(int amount){

       if (account.getBalance()>=amount){

           System.out.println(Thread.currentThread().getName()+" Trying to withdraw Rs "+amount);

           try {
               Thread.sleep(5000);
           }catch (InterruptedException exception){
               exception.printStackTrace();
           }

           account.setBalance(amount);
           System.out.println(Thread.currentThread().getName()+" Withdraw Rs "+amount +" , Remaining Balance Rs "+account.getBalance());

       }

       if (account.getBalance()<amount){

           System.out.println(Thread.currentThread().getName()+" No Enought Cash. Your available balance is Rs "+ account.getBalance());
       }

    }
}
