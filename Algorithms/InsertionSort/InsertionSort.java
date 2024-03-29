package Algorithms.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[] { 6, 5, 1, 3, 12, 11, 10 };
        insertionSort(a);

        for (int i : a) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }
    }
}
