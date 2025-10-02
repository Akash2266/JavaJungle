package Week3_Additional_Problems;

public class Problem5 {
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                      };
          int[][] result = new int[3][3];
          int n = mat.length;

            for (int i=0; i< mat.length; i++){
                  for (int j=0; j< mat.length; j++){
                        result[j][n-1-i] = mat[i][j];
                  }
            }
        for (int[] ints : result) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
