package Additional_problems_of_week3;

public class Problem10 {
    public static void main(String[] args) {
        String s1 = "babad";
        String subString = "", lps="";
        int maxLength=0;

           for (int i=0; i<s1.length(); i++){
                 for (int j=i; j<s1.length(); j++){
                        subString = s1.substring(i, j+1);

                           if (isPalindrome(subString) && subString.length()>maxLength){
                               maxLength = subString.length();
                               lps = subString;
                           }

                 }
           }
        System.out.println(lps);
    }
       static boolean isPalindrome (String string){
             char[] subString = string.toCharArray();
             int left=0, right=subString.length-1;
             char temp;
                  while (left < right){
                         temp = subString[left];
                         subString[left] = subString[right];
                         subString[right] = temp;
                         left++;
                         right--;
           }
                  String str = new String(subString);

                    if (string.equals(str))
                        return true;

                      else
                          return false;
       }
}
