package Week3_Assignment;

class Rectangle {
      int len, breadth;

         int area (int len, int breadth) {
             this.len = len;
             this.breadth = breadth;
             return len*breadth;
         }

         int perimeter (int len, int breadth) {
             this.len = len;
             this.breadth = breadth;
             return 2*(len+breadth);
         }


}


public class Problem1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Area of rectangle 1: "+rectangle1.area(2, 5));
        System.out.println("Perimeter of rectangle 1: "+rectangle1.perimeter(3,4));

        System.out.println();

        System.out.println("Area of rectangle 2: "+rectangle2.area(3, 4));
        System.out.println("Perimeter of rectangle 2: "+rectangle1.perimeter(2,4));

    }
}
