import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int time1, time2;

          time1 = scan.nextInt();
          time2 = scan.nextInt();

           if (time1 > time2)
               System.out.println("Varun");

           else if (time2 > time1)
               System.out.println("Arjun");

           else
               System.out.println("Tie");


    }
}
