public class Problem7 {
    public static void main(String[] args) {
            int n=153;
            int cpy1=n, cpy2=n;
            int digits=0, rem, armstrong=0;

               while (cpy1 != 0){
                  cpy1 /= 10;
                  digits++;
               }

                 while (cpy2 != 0){
                     rem = cpy2%10;
                     armstrong += Math.pow(rem, digits);
                     cpy2 /= 10;
                 }

                   if (n == armstrong)
                       System.out.println("Armstrong");
                   else
                       System.out.println("!Armstrong");
    }
}
