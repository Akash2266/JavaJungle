package Week5_Assignment.student;


public class Student {
    String name;
    int rollNo, marks;
    Address address;

    public Student(Address address, String name, int rollNo, int marks){
        this.address = address;
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudentDetails (){
        System.out.println();
        System.out.println("Student's Details: ");
        System.out.println("----------------------");
        System.out.println("Name: "+name);
        System.out.println("Register Number: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("City: "+address.city);
        System.out.println("State: "+address.state);

    }
}

