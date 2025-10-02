package Week3_Additional_Problems;

public class Problem1 {
    public static void main(String[] args) {
            int[] nums = {1, 2, 4, 5};
            int n = nums.length+1;
            int sum = n*(n+1)/2;
            int actualSum=0, missingElement;

               for (int num: nums)
                       actualSum += num;

                  missingElement = sum-actualSum;
                  System.out.println(missingElement);
    }
}
