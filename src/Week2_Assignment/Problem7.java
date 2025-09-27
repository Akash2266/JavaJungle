package Week2_Assignment;

public class Problem7 {
    public static void main(String[] args) {
        int n = 153, rem=0;
        int cpy = n, arm=0, digit=n, pow=0;

          while (digit != 0){
              pow++;
              digit /= 10;
          }

             while (cpy != 0){
                 rem = cpy%10;
                 arm += Math.pow(rem, pow);
                 cpy /= 10;
             }

               if (arm == n)
                   System.out.println("Armstrong Number");
                  else
                   System.out.println("!Armstrong Number");
    }
}
