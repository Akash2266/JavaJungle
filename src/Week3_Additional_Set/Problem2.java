package Week3_Additional_Set;

public class Problem2 {
    public static void main(String[] args) {
              int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
              int currSum =0, temp;
              int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            temp = currSum + num;

            if (num > currSum)
                currSum = num;

            else
                currSum = temp;

            if (currSum > maxSum)
                maxSum = currSum;
        }
        System.out.println(maxSum);
    }
}
