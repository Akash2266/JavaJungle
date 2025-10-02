package Problems_of_week2;

public class Problem8 {
    public static void main(String[] args) {
        int n = 1221, cpy=n, rev=0, rem=0;

        while (cpy != 0){
            rem = cpy%10;
            rev = (rev*10)+rem;
            cpy /= 10;
        }
        if (rev == n)
            System.out.println("Palindrome");
        else
            System.out.println("!Palindrome");
    }
}