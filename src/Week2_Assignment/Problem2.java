package Week2_Assignment;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {14, 28, 19, 33, 45, 12};
        int secondMax, max, maxIndex=0;
        max = arr[0];
        secondMax = arr[1];

        for (int i=0; i< arr.length; i++){
              if (arr[i] > max){
                  max = arr[i];
                  maxIndex = i;
              }
        }

           for (int i=0; i< arr.length; i++){
               if ( i == maxIndex)
                   continue;
                 else if (arr[i] > secondMax)
                     secondMax = arr[i];
           }

        System.out.println("Second Largest element: "+secondMax);
    }
}
