package Algorithms.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 4, 1, 8, 56, 7 };

        bubbleSort(a);

        System.out.println("\n BUBBLE SORT");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                System.out.println(a[j]);

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("\n");
        }
    }
}
