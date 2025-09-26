
   class BankAccount {
         int accountNumber;
         double balance;

             BankAccount () { balance = 0; }
             BankAccount (double balance) { this.balance = balance; }

                void deposit (double amount) { balance += amount; }

              double withdraw (double amount)  {

                      if (amount > balance)
                          System.out.println("Insufficient Balance");

                      else
                          balance -= amount;

                      return  balance;


             }
   }

public class Problem4 {
    public static void main(String[] args) {

                  BankAccount bankAccount = new BankAccount();
                  bankAccount.deposit(1245.12);
                  System.out.println("Current Balance: "+bankAccount.withdraw(555.00));
                  // Transaction 1

                   System.out.println();

                   BankAccount bankAccount1 = new BankAccount(1000.00);
                   bankAccount1.deposit(200.00);
                   System.out.println("Current Balance: "+bankAccount1.withdraw(600.00));
                   //Transaction 2

    }
}
