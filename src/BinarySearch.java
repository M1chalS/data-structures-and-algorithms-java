import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // O(log (n))

        // Cons
        // Slow for small data sets
        // Data set must be sorted

        // Pros
        // Fast for medium and large data sets

        int[] array = new int[1000000];
        int target = 654324;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle: " + middle + ", Low: " + low + ", High: " + high);

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else return middle;
        }

        return -1;
    }

}
