package Algorithms.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 1, 3, 12, 11, 10 };
        selectionSort(a);

        for (int i : a) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
