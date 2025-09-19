import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num1, num2;
            int op;

            num1 = scan.nextInt();
            num2 = scan.nextInt();
            op = scan.nextInt();

              if (op == 1)
                  System.out.println(num1+num2);

              else if (op == 2)
                  System.out.println(num1-num2);

              else if (op == 3)
                  System.out.println(num1*num2);

              else
                  System.out.println(num1/num2);
    }
}
