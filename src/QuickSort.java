public class QuickSort {
    public static void main(String[] args) {
        // O(n log (n)) worst O(n^2) if sorted
        // Small data set great
        // Large data set great

        int array[] = {9, 1, 4, 5, 3, 2, 6, 8, 7};

        quickSort(array, 0, array.length - 1);

        for(int i : array) {
            System.out.print(i);
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;

        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
