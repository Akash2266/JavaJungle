package Week1_Assignment;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        int marks;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks :");
        marks = scanner.nextInt();

          if (marks >= 90)
              System.out.println('A');

          else if (marks>=75)
              System.out.println('B');

          else if (marks>=50)
              System.out.println('C');

          else
              System.out.println("Fail");
    }
}
