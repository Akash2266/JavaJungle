package Week3_Assignment;

class BankAccount {
     private int accountNumber;
     private double balance;

         BankAccount () { this.balance = 0; }

        String deposit (double amount){
             this.balance += amount;
             return "Deposited "+amount;
         }

         String withdraw (double amount){
             if ( balance >=  amount){
                 balance -= amount;
                 return "Withdrawn " +amount;
             }

               else{
                 return "Insufficient Balance!";
             }


         }

            String getBalance () { return  "Current Balance: "+balance; }


   }


public class Problem4 {
    public static void main(String[] args) {

        BankAccount transaction1 = new BankAccount();
         System.out.println("Transaction 1: ");
         System.out.println("=========================");
         System.out.println(transaction1.deposit(5000.00));
         System.out.println(transaction1.withdraw(1999.00));
         System.out.println(transaction1.getBalance());
         System.out.println();

        BankAccount transaction2 = new BankAccount();
        System.out.println("Transaction 2: ");
        System.out.println("=========================");
        System.out.println(transaction2.deposit(2000.00));
        System.out.println(transaction2.withdraw(799.00));
        System.out.println(transaction2.getBalance());
        System.out.println();

        BankAccount transaction3 = new BankAccount();
        System.out.println("Transaction 3: ");
        System.out.println("=========================");
        System.out.println(transaction3.deposit(1000.00));
        System.out.println(transaction3.withdraw(500.00));
        System.out.println(transaction3.getBalance());
        System.out.println();


        BankAccount transaction4 = new BankAccount();
        System.out.println("Transaction 4: ");
        System.out.println("=========================");
        System.out.println(transaction4.deposit(1000.00));
        System.out.println(transaction4.withdraw(5000.00));
        System.out.println(transaction4.getBalance());
        System.out.println();

    }
}
