package Additional_problems_of_week3;

public class Problem7 {
    public static void main(String[] args) {
        int[][] mat = { {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1}
                       };

              for (int i=0; i< mat.length; i++){
                    for (int j=0; j<mat.length; j++){
                          if (mat[i][j] == 0){
                              markRow (mat[i]);
                              markcolumn (mat, j);
                          }

                    }
              }

                 for (int i=0; i<mat.length; i++){
                       for (int j=0; j< mat.length; j++){
                           if (mat[i][j] == -1)
                               mat[i][j] = 0;
                       }
                 }

                 for (int i=0; i< mat.length; i++){
                      for (int j=0; j< mat.length; j++){
                          System.out.print(mat[i][j] +" ");
                      }
                     System.out.println();
                 }
    }
       static void markRow (int[] mat){
         for (int i=0; i< mat.length; i++){
                if (mat[i] != 0)
                    mat[i]= -1;
         }
       }
          static void markcolumn (int[][] mat, int j){
              for (int i=0; i< mat.length; i++){
                  if (mat[i][j] != 0)
                      mat[i][j] = -1;
              }
          }
}
