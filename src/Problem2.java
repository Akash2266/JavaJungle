public class Problem2 {
    public static void main(String[] args) {
        int[] arr = new int[]{14, 28, 19, 33, 45, 12};
        int index = 0;
        int max = arr[0];
        int secondLargest = arr[1];

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        for(int var6 = 0; var6 < arr.length; ++var6) {
            if (var6 != index && arr[var6] > secondLargest) {
                secondLargest = arr[var6];
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}

