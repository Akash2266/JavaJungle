
class Rectangle {

          float len;
          float breadth;

             int area (int len, int breadth){

                   this.len = len;
                   this.breadth = breadth;

                     return len*breadth;
            }

               int perimeter (int len, int breadth){

                    this.len = len;
                    this.breadth = breadth;

                       return 2*(len+breadth);
               }

}

public class Problem1 {
    public static void main(String[] args) {
          Rectangle rectangle = new Rectangle();
        System.out.println("Area of a Rectangle: "+rectangle.area(2,5));
        System.out.println("Perimeter of a Rectangle:  "+rectangle.perimeter(2,3));
    }
}
