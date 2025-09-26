public class Problem7 {
    public static void main(String[] args) {
        int n = 153;
        int cpy1 = n;
        int cpy2 = n;
        int digits = 0;

        int armstrong;
        for(armstrong = 0; cpy1 != 0; ++digits) {
            cpy1 /= 10;
        }

        while(cpy2 != 0) {
            int rem = cpy2 % 10;
            armstrong = (int)((double)armstrong + Math.pow((double)rem, (double)digits));
            cpy2 /= 10;
        }

        if (n == armstrong) {
            System.out.println("Armstrong");
        } else {
            System.out.println("!Armstrong");
        }

    }
}

