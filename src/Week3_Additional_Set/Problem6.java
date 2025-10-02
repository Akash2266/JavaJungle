package Week3_Additional_Set;

public class Problem6 {
    public static void main(String[] args) {
          int[][] mat = { {1, 3, 5},
                          {7, 9, 11},
                          {13, 15, 17}
                         };
          int target = 9;
          int column = mat[0].length;

        for (int[] ints : mat) {

            if (target >= ints[0] && target <= ints[column - 1]) {
                System.out.println(binarySearch(ints, target));
                System.exit(0);
            }

        }
        System.out.println("false");

    }
        static boolean binarySearch (int[] nums, int target){
                int left=0, right= nums.length-1, mid;

                   while (left <= right){
                          mid = left+right/2;

                            if (nums[mid] == target)
                                  return true;

                            else if (target > nums[mid])
                                left++;

                            else
                                right--;
                   }
                     return false;
        }
}
