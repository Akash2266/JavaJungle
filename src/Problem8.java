public class Problem8 {
    public static void main(String[] args) {
        int n = 1221;
        int cpy=n;
        int rev=0, rem;

        while (cpy != 0) {
            rem = cpy%10;
            rev = rev*10+rem;
            cpy /= 10;
        }

        if (n == rev)
            System.out.println("Palindrome");

        else
            System.out.println("!Palindrome");
    }
}
