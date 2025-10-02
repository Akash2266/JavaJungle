package Week3_Additional_Set;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        List<Character> list = new ArrayList<Character>();
        int maxLength=0, start=0, end=0;

          while (end < s1.length()){
                 if (!list.contains(s1.charAt(end))){
                        list.add(s1.charAt(end));
                        end++;
                     maxLength = Math.max(maxLength, list.size());
                 }
                    else{
                         list.remove(Character.valueOf(s1.charAt(start)));
                         start++;
                 }
          }
        System.out.println(maxLength);
    }
}
