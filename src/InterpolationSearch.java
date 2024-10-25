public class InterpolationSearch {
    public static void main(String[] args) {
        // Avg: O(log(log (n)))   Worst: O(n)

        // Cons
        // Slow for small data sets
        // Data must be sorted

        // Pros
        // Improvement for BinarySearch
        // Fast for medium and large data sets
        // Guessing where data is based on probe

//        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);

        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if(array[probe] == value) {
                return probe;
            } else if(array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
}
