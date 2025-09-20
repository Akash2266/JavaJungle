public class Problem4 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};

        for(int i = 0; i < arr.length; ++i) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

