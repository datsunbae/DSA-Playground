package Algorithms.MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrays = new int[] { 2, 6, 1, 3, 4, 12, 10, 9, 7 };

        mergeSort(arrays);

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    private static void mergeSort(int[] arrays) {

        int length = arrays.length;
        if (length <= 1)
            return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrays.length - mid];

        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < mid) {
                leftArray[i] = arrays[i];
            } else {
                rightArray[j] = arrays[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arrays);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] arrays) {
        int leftSize = arrays.length / 2;
        int rightSize = arrays.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                arrays[i] = leftArray[l];
                i++;
                l++;
            } else {
                arrays[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            arrays[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            arrays[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
