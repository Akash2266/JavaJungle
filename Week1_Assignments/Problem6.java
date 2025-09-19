import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           int marks;

           marks = scan.nextInt();

           if (marks >= 90)
               System.out.println("A");

           else if (marks >= 75 && marks < 90)
               System.out.println("B");

           else if (marks >= 50 && marks < 75)
               System.out.println("C");

           else
               System.out.println("Fail");

    }
}
