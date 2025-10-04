package Week4_Assignment;

abstract class Shape {
      abstract double area();
}

   class Circle extends Shape{
        double radius;
          Circle (double radius){
              this.radius = radius;
          }
        @Override
          double area (){
            return Math.PI*radius*radius;
        }
   }
      class Rectangle extends Shape{
                double len, breadth;

                   Rectangle (double len, double breadth){
                         this.breadth = breadth;
                         this.len = len;
                   }
                      @Override
                        double area(){
                           return len*breadth;
                      }
      }

         class Triangle extends Shape {
                     double base, height;

                        Triangle (double base, double height){
                               this.base =base;
                               this.height = height;
                        }

                          @Override
                           double area (){
                                 return 0.5*base*height;
                          }
         }
public class Problem1 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
            shape[0] = new Circle(3.0);
            shape[1] = new Rectangle(2.5, 3.1);
            shape[2] = new Triangle(1.5, 2.0);

              for (int i=0; i< shape.length; i++){
                  System.out.println("Area of the Shape "+(i+1)+": "+shape[i].area());
              }
    }
}
