import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
                 Scanner scan = new Scanner(System.in);
                 int balance;

                 balance = scan.nextInt();

               if (balance > 0)
                 System.out.println("Positive Balance");

            else if (balance < 0)
                System.out.println("Overdraft");

            else
                System.out.println("Zero Balance");
    }
}
