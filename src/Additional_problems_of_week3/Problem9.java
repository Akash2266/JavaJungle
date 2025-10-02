package Additional_problems_of_week3;

public class Problem9 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        int[] count = new int[26];

           for (char c:s1.toCharArray())
                 count[c-'a']++;

             for (char c : s2.toCharArray())
                 count[c-'a']--;

             for (int num:count){
                   if (num != 0){
                       System.out.println("false");
                       System.exit(0);
                   }
             }
        System.out.println("true");
    }
}
