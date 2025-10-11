package Week5_Assignment.report;

import Week5_Assignment.student.Address;
import Week5_Assignment.student.Student;

import java.util.Scanner;

public class ReportGenerator {
    public static void main(String[] args) {
          int rollNo, marks;
          String city, state, name;
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        name = scanner.nextLine();

        System.out.print("Enter student's register number: ");
        rollNo = scanner.nextInt();

            scanner.nextLine();

        System.out.print("Enter student's City: ");
        city = scanner.nextLine();

        System.out.print("Enter student's State: ");
        state = scanner.nextLine();

        System.out.print("Enter student's marks: ");
        marks = scanner.nextInt();

        Address address = new Address(city, state);
        Student student = new Student(address, name, rollNo, marks);
                        student.displayStudentDetails();

    }
}
