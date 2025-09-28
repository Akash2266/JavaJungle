package Week1_Assignment;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
          int time1, time2;
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter varun's time: ");
        time1 = scanner.nextInt();

        System.out.print("Enter arjun's time: ");
        time2 = scanner.nextInt();

            if (time1 > time2)
                System.out.println("Varun");

               else if (time2 > time1)
                  System.out.println("Arjun");

                  else
                      System.out.println("Tie");
    }
}
