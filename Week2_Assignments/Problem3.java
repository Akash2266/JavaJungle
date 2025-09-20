public class Problem3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 2, 6, 2, 9, 6};
        int visited = -1;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] != -1) {
                int count = 1;

                for(int j = i + 1; j < arr.length; ++j) {
                    if (arr[i] == arr[j]) {
                        ++count;
                        arr[j] = visited;
                    }
                }

                if (count > 1) {
                    System.out.print(arr[i] + " appears " + count);
                }
            }
        }

    }
}
