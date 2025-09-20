public class Problem5 {
    public static void main(String[] args) {
        int n = 12345;

        int rev;
        for(rev = 0; n != 0; n /= 10) {
            int rem = n % 10;
            rev = rev * 10 + rem;
        }

        System.out.println(rev);
    }
}
