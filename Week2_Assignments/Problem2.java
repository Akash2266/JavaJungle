  import java.util.Scanner;

   class Student {
          String name;
          int rollNumber, marks;

            void display (){
                System.out.println();

                System.out.println("STUDENT'S DETAILS: ");
                System.out.println("============================");
                System.out.println("NAME: "+name);
                System.out.println("ROLL_NUMBER: "+rollNumber);
                System.out.println("MARKS: "+marks);
            }

              void get (){
                   Scanner scanner = new Scanner(System.in);
                  System.out.println();

                  System.out.print("Enter student's name: ");
                  name = scanner.next();

                  System.out.print("Enter student's roll number: ");
                  rollNumber = scanner.nextInt();

                  System.out.print("Enter student's marks: ");
                  marks = scanner.nextInt();

              }
   }

public class Problem2 {
    public static void main(String[] args) {

           for (int i=0; i<3; i++){
               Student student = new Student();
               student.get();
               student.display();
           }

    }
}
