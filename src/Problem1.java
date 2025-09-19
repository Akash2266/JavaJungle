package AssignmentsWeek1
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int num;

         num = scan.nextInt();

           if (num%2 == 0)
               System.out.println("ON");

            else
               System.out.println("OFF");

    }
}
