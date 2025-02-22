public class MergeSort {
    public static void main(String[] args) {
        // O(n log (n)) but uses more space O(n)
        // Small data set great
        // Large data set great

        int array[] = {9, 1, 4, 5, 3, 2, 6, 8, 7};

        mergeSort(array);

        for(int i : array) {
            System.out.print(i);
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
