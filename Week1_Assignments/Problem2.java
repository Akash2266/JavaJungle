public class Problem2 {
    public static void main(String[] args) {
          int[] arr = {14, 28, 19, 33, 45, 12};
          int i, max, index=0, secondLargest;
          max = arr[0];
          secondLargest = arr[1];


            for (i=0; i<arr.length; i++){
                   if (arr[i] > max){
                       max = arr[i];
                       index = i;
                   }
            }

              for (i=0; i<arr.length; i++){
                    if (i == index)
                        continue;

                    else if (arr[i] > secondLargest)
                        secondLargest = arr[i];
              }
        System.out.println("Second Largest Element: "+secondLargest);
    }
}
