package Additional_problems_of_week3;

public class Problem3 {
    public static void main(String[] args) {
                 int[] nums = {2, 0, 2, 1, 1, 0};
                 int mid = 0, low = 0, high = nums.length-1, temp;

                    while (mid <= high){

                        if (nums[mid] == 0){
                              temp = nums[low];
                              nums[low] = nums[mid];
                              nums[mid] = temp;
                              low++;
                              mid++;
                          }

                          else if (nums[mid] == 1)
                              mid++;

                            else{
                                  temp = nums[high];
                                  nums[high] = nums[mid];
                                  nums[mid] = temp;
                                  mid++;
                                  high--;
                        }
                    }
                    for (int num: nums)
                        System.out.print(num +" ");
    }
}
