import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;

          year = scan.nextInt();

           if (year%100 == 0){
                 if (year%400 == 0)
                     System.out.println("Leap Year");

                 else
                     System.out.println("Not a Leap Year");
           }
             else {
                 if (year%4 == 0)
                     System.out.println("Leap Year");

                 else
                     System.out.println("Not a Leap Year");
           }
    }
}
