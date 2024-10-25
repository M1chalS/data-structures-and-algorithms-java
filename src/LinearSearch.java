public class LinearSearch {
    public static void main(String[] args) {
        // O(n)

        // Cons
        // Slow for large data sets

        // Pros
        // Fast for small and medium data sets
        // Does not need to be sorted
        // Useful for data structures that do not have random access (Linked List)

        int[] array = {4, 5, 2, 1, 7, 8, 5, 3, 9, 6};

        int index = linearSearch(array, 8);

        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
