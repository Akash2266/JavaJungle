package Week3_Assignment;

class Student{
     String name;
     int rollNumber, marks;

       void display (){
           System.out.println("Student's Details");
           System.out.println("=========================");
           System.out.println("Name: "+name);
           System.out.println("Roll_Number: "+rollNumber);
           System.out.println("Marks: "+marks);
           System.out.println();
       }

         Student (String name, int rollNumber, int marks){
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
       }

}

public class Problem2 {
    public static void main(String[] args) {

           Student student1 = new Student("Walter", 201, 88);
           student1.display();

           Student student2 = new Student("White", 202, 80);
           student2.display();

           Student student3 = new Student("Harry", 203, 48);
           student3.display();
    }
}
