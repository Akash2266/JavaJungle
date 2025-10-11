package Week5_Assignment;


import java.util.Random;


class InsufficientException extends Exception{

          InsufficientException(String msg){
               super(msg);
           }
   }

class BankAccount{
         private int balance;

         BankAccount(int balance){
                this.balance = balance;
            }

               synchronized void deposit (int amount){
                   try {
                       if (amount < 0){
                           throw new InsufficientException("Amount is negative");
                       }

                       balance += amount;
                       System.out.println("Deposited: "+amount+ " | Balance: "+balance);

                   }catch (InsufficientException e){
                       System.out.println(Thread.currentThread().getName()+": "+e.getMessage());
                   }

         }

               synchronized void withdraw (int amount ){

                  try {

                      if (amount < 0){
                          throw new InsufficientException("Amount is negative");
                      }

                      if (amount > balance){
                          throw new InsufficientException("Insufficient Balance");
                      }

                      balance -= amount;
                      System.out.println("Withdrawn Amount: "+amount+ " | Balance: "+balance);

                  } catch (InsufficientException e){
                      System.out.println(Thread.currentThread().getName()+": "+e.getMessage());
                  }

         }
             synchronized int getBalance(){
                return balance;
             }
  }
      class User implements Runnable{
          BankAccount bankAccount;
          Random random = new Random();

          User(BankAccount bankAccount){
                 this.bankAccount = bankAccount;
            }

          @Override
          public void run() {
                int amount, withdrawAmount;

                for (int i=0; i<3; i++){
                     amount = random.nextInt(500);
                     withdrawAmount = random.nextInt(600);

                         bankAccount.deposit(amount);
                         bankAccount.withdraw(withdrawAmount);

                          try {
                              Thread.sleep(200);
                          }catch (InterruptedException e){
                              System.out.println(e.getMessage());
                          }

              }
          }
      }

public class Problem1 {
    public static void main(String[] args) throws InterruptedException {
                BankAccount bankAccount = new BankAccount(1000);

                Thread thread1 = new Thread(new User(bankAccount), "User1");
                Thread thread2 = new Thread(new User(bankAccount), "User2");
                Thread thread3 = new Thread(new User(bankAccount), "User3");

                   thread1.start();
                   thread2.start();
                   thread3.start();

                   thread1.join();
                   thread2.join();
                   thread3.join();

        System.out.println("Final Balance: "+bankAccount.getBalance());

    }
}
