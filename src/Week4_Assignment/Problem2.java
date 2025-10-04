package Week4_Assignment;

abstract class Employee {
        abstract int getBonus();
}

  class Manager extends Employee{
        int bonus;

             Manager(int bonus){
                   this.bonus = bonus;
             }

             @Override
          int getBonus(){
                 return bonus;
             }
  }

   class Developer extends Employee{
         int bonus;

            Developer(int bonus){
                this.bonus = bonus;
            }
         @Override
          int getBonus(){
             return bonus;
         }
   }

public class Problem2 {
    public static void main(String[] args) {
        Employee employee = new Developer(15000);
        System.out.println("Developer's Bonus: "+employee.getBonus());

        employee = new Manager(20000);
        System.out.println("Manager's Bonus: "+employee.getBonus());
    }

}
