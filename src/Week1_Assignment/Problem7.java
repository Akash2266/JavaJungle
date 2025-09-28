package Week1_Assignment;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        int a, b, op;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.print("Enter operator: ");
        op = scanner.nextInt();

          if (op == 1)
              System.out.println(a+b);

            else if (op == 2)
              System.out.println(a-b);

              else if (op == 3)
              System.out.println(a*b);

                else
              System.out.println(a/b);
    }
}
