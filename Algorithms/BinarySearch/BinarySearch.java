package Algorithms.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        int target = 4;

        int result = binarySearch(a, target);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found");
        }
    }

    private static int binarySearch(int[] a, int target) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            System.out.println("Mid: " + mid);

            if (a[mid] > target) {
                high = mid - 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
