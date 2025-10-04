package Week4_Assignment;

   class Etudiant {
          String name;
          int rollno, marks;

             Etudiant (String name, int rollno, int marks){
                   this.name = name;
                   this.rollno = rollno;
                   this.marks = marks;
             }

               Etudiant (Etudiant etudiant){
                    this.name = etudiant.name;
                    this.rollno = etudiant.rollno;
                    this.marks = etudiant.marks;
               }
   }

public class Problem9 {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Akash", 102, 88);
        Etudiant etudiantcopy = new Etudiant(etudiant);

            etudiant.rollno=101;

            System.out.println("Etudiant's rollno: "+etudiant.rollno);
            System.out.println("Etudiant copy's: "+etudiantcopy.rollno);
    }
}
