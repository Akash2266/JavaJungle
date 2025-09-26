package Week3_Assignment;

  class Employee {
       private String name;
       private int salary, id;

       void setName (String name) { this.name = name; }
       void setSalary (int salary) { this.salary = salary; }
       void setId (int id) { this.id = id; }

       String getName () { return name; }
       int getSalary () { return  salary; }
       int getId () { return id; }
  }

public class Problem5 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(202);
        employee.setName("Walter");
        employee.setSalary(500000);

        System.out.println("Employee Details: ");
        System.out.println("======================");
        System.out.println("Employee's ID: " +employee.getId());
        System.out.println("Employee's Name: "+employee.getName());
        System.out.println("Employee's Salary: "+employee.getSalary());

    }
}
