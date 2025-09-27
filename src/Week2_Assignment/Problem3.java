package Week2_Assignment;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 2, 9, 6};
        int count, visited=-1;

           for (int i=0; i<arr.length-1; i++){
               count=1;
                 if (arr[i] != -1){
                     for (int j=i+1; j< arr.length; j++){
                         if (arr[i] == arr[j]){
                             count++;
                             arr[j] = visited;
                         }
                     }
                 }

                 if (count > 1)
               System.out.println(arr[i] +" appears " +count);
           }
    }
}
