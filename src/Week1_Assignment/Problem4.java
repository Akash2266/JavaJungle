package Week1_Assignment;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        c = scanner.nextInt();

          if (a>=b && a>=c)
              System.out.println(a);

            else if (b>=a && b>=c)
              System.out.println(b);

               else
              System.out.println(c);
    }
}
