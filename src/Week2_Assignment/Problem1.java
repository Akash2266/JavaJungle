package Week2_Assignment;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 12, -9, 0, 7};
        int zeroCount=0, positiveCount=0, negativeCount=0;

           for (int i=0; i<arr.length; i++){
                 if (arr[i] > 0)
                     positiveCount++;
                    else if (arr[i] < 0)
                        negativeCount++;
                    else
                        zeroCount++;
           }
        System.out.println("Positive numbers count: "+positiveCount);
        System.out.println("Negative numbers count: "+negativeCount);
        System.out.println("Zero's count: "+zeroCount);
    }
}
