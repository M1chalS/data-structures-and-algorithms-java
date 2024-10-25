public class BubbleSort {
    public static void main(String[] args) {
        // O(n^2)
        // Small data set ok
        // Large data set very bad

        int array[] = {9, 1, 4, 5, 3, 2, 6, 7, 8};

        bubbleSort(array);

        for(int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
