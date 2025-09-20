public class Problem8 {
    public static void main(String[] args) {
        int n = 1221;
        int cpy = n;

        int rev;
        for(rev = 0; cpy != 0; cpy /= 10) {
            int rem = cpy % 10;
            rev = rev * 10 + rem;
        }

        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("!Palindrome");
        }

    }
}
