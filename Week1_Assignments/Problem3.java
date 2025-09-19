public class Problem3 {
    public static void main(String[] args) {
         int[] arr = {2, 4, 2, 6, 2, 9, 6};
         int count, visited=-1;
         int i,j;

            for (i=0; i< arr.length; i++){
                if (arr[i] != -1){
                count=1;
                for (j=i+1; j<arr.length; j++){
                     if (arr[i] == arr[j]){
                         count++;
                         arr[j] = visited;
                     }
                }
                  if (count > 1)
                   System.out.print(arr[i] +" appears "+count);
            }
              }
    }
}
