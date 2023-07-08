package Algorithms.QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = new int[] { 2, 6, 1, 3, 4, 12, 10, 9, 7 };

        quickSort(arrays, 0, arrays.length - 1);

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    private static void quickSort(int[] arrays, int start, int end) {
        if (start >= end)
            return;

        int pivot = partititon(arrays, start, end);
        quickSort(arrays, start, pivot - 1);
        quickSort(arrays, pivot + 1, end);
    }

    private static int partititon(int[] arrays, int start, int end) {
        int pivot = arrays[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arrays[j] < pivot) {
                i++;
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
            }
        }

        i++;
        int temp = arrays[i];
        arrays[i] = arrays[end];
        arrays[end] = temp;

        return i;
    }

}
