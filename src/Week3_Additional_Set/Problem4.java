package Week3_Additional_Set;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int count=0, k=2, sum;

          for (int i=0; i<nums.length; i++){
              sum=0;
              for (int j=i; j<nums.length; j++){
                  sum += nums[j];

                    if (sum == k)
                        count++;
              }
          }
        System.out.println(count);
    }
}
