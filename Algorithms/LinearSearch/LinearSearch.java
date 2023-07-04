package Algorithms.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 6, 1, 8, 9, 12, 14, 3 };

        int result = linearSearch(a, 11111);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found");
        }

    }

    private static int linearSearch(int[] a, int value) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == value)
                return i;
        }
        return -1;
    }
}
