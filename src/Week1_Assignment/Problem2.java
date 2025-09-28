package Week1_Assignment;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int balance;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your balance: ");
        balance = scanner.nextInt();

           if (balance > 0)
               System.out.println("Positive Balance");
              else if (balance < 0)
               System.out.println("Overdraft");
                 else
               System.out.println("Zero Balance");
    }
}
