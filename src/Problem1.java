public class Problem1 {
    public static void main(String[] args) {
        int [] arr ={5, -3, 0, 12, -9, 0, 7};
        int negativeCount=0, positiveCount=0, zeroCount=0;
        int i;

          for (i=0; i<arr.length; i++){
              if (arr[i] == 0)
                  zeroCount++;
              else if (arr[i] > 0)
                  positiveCount++;
              else
                  negativeCount++;
          }
        System.out.println("Zero Numbers count: "+zeroCount);
        System.out.println("Positive Numbers Count: "+positiveCount);
        System.out.println("Negative Numbers Count: "+negativeCount);
    }
}
