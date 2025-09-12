package OptionalAssignmentProblems;

public class Problem4 {
    public static void main(String[] args) {

          int studentMark = 88;

             if (studentMark >= 90)
                 System.out.println("Grade A");

             else if (studentMark >= 75 && studentMark <= 89)
                 System.out.println("Grade B");

             else if (studentMark >=50 && studentMark <= 74 )
                 System.out.println("Grade C");

              else
                 System.out.println("Fail");
    }
}
