package Week4_Assignment;

  class Point {
         int x, y;

           Point (int x, int y){
                 this.x = x;
                 this.y = y;
           }

             Point (Point point){
               this.x = point.x;
               this.y = point.y;
             }
  }

public class Problem10 {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        Point pointcopy1 = new Point(point);
        Point pointcopy2 = new Point(point);

        System.out.println("Copy-1 of the Co-ordinate X:" +pointcopy1.x +" Y:"+pointcopy1.y);
        System.out.println("Copy-2 of the Co-ordinate X:" +pointcopy2.x +" Y:"+pointcopy2.y);
    }
}
