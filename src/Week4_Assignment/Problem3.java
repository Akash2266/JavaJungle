package Week4_Assignment;

abstract class BankAccount{
      abstract boolean deposit (int amount);
      abstract String withdraw (int amount);
      abstract String checkBalance();
}
   class SavingsAccount extends BankAccount{

        int balance;

        SavingsAccount (){
                 balance=1000;
           }

           String checkBalance (){
                if (balance < 1000){
                    balance -= 100;
                    System.out.println("Current Balance: "+balance);
                    return "Deducted 100 (breaching guidelines)";
                }
               return "No deduction (within the guidelines)";

        }

          @Override
            boolean deposit (int amount){
                  balance += amount;
                  return true;
          }

          @Override
          String withdraw (int amount){
                 if (amount > balance)
                     return "Overdraft";

                 balance -= amount;
                 return Integer.toString(amount);
          }

   }
class CurrentAccount extends BankAccount{

    int balance;

    CurrentAccount (){
        balance=2500;
    }

    String checkBalance (){
        if (balance < 2500){
            balance -= 250;
            System.out.println("Current Balance: "+balance);
            return "Deducted 250 (breaching the guidelines)";
        }

        return "No deduction (within the guidelines)";
    }

    @Override
    boolean deposit (int amount){
        balance += amount;
        return true;
    }

    @Override
    String withdraw (int amount){
        if (amount > balance)
            return "Overdraft";

        balance -= amount;
        return Integer.toString(amount);
    }

}
public class Problem3 {
    public static void main(String[] args) {
            System.out.println("Current Account Transactions: ");
            System.out.println("----------------------------------------------");
            BankAccount bankAccount = new CurrentAccount();
            System.out.println("Deposit Status: "+bankAccount.deposit(1000));
            System.out.println("Withdrawn Amount: "+bankAccount.withdraw(1000));
            System.out.println(bankAccount.checkBalance());
            System.out.println("----------------------------------------------");

            System.out.println();

            System.out.println("Savings Account Transactions: ");
            System.out.println("----------------------------------------------");
            bankAccount = new SavingsAccount();
            System.out.println("Deposit Status: "+bankAccount.deposit(500));
            System.out.println("Withdrawn Amount: "+bankAccount.withdraw(1000));
            System.out.println(bankAccount.checkBalance());

    }
}
