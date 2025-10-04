package Week4_Assignment;

   class Person{
         String name;
         int age;
            Person(String name, int age){
                   this.age = age;
                   this.name = name;
            }
   }
      class Student extends Person{
           int marks;
           char grade;

              Student(int marks, char grade, String name, int age){
                  super(name, age);
                  this.grade = grade;
                  this.marks = marks;
              }

                void getStudent(){
                    System.out.println("Student Details: ");
                    System.out.println("--------------------");
                    System.out.println("Name: "+name);
                    System.out.println("Age: "+age);
                    System.out.println("Marks: "+marks);
                    System.out.println("Grade: "+grade);
                    System.out.println();
                }
      }

        class GraduateStudent extends Student{
              String researchTopic;

              GraduateStudent(String researchTopic, int marks, char grade, String name, int age){
                           super(marks, grade, name, age);
                           this.researchTopic = researchTopic;
                     }

                       void getGraduateStudents(){
                System.out.println("GraduateStudent Details: ");
                System.out.println("--------------------");
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Marks: "+marks);
                System.out.println("Grade: "+grade);
                System.out.println("Research topic: "+researchTopic);
                System.out.println();

            }
        }

public class Problem6 {
    public static void main(String[] args) {
            new Student(91, 'A', "Walter", 21);
            GraduateStudent graduateStudent = new GraduateStudent("Analysis_of_SQL_and_NoSQl_Databases",89, 'B', "White", 22);
            graduateStudent.getStudent();
            graduateStudent.getGraduateStudents();
    }
}
