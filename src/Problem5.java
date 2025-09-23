
    class Employee {
         private  String name;
         private int id, salary;

            String getName () { return name; }
            int getId () { return  id; }
            int getSalary () { return salary; }

               void  setName (String name) { this.name = name; }
               void  setId (int id) { this.id = id; }
               void setSalary (int salary) { this.salary = salary; }

    }

public class Problem5 {
    public static void main(String[] args) {
              Employee employee = new Employee();
              employee.setId(1729);
              employee.setName("Walter");
              employee.setSalary(150000);

        System.out.println("Employee Details: ");
        System.out.println("============================");
        System.out.println("Employee's ID: "+employee.getId());
        System.out.println("Employee's Name: "+employee.getName());
        System.out.println("Employee's Salary: "+employee.getSalary());

    }
}
