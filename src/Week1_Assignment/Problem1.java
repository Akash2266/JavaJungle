package Week1_Assignment;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        n = scanner.nextInt();

           if (n%2 ==  0)
               System.out.println("ON");
               else
               System.out.println("OFF");
    }
}
