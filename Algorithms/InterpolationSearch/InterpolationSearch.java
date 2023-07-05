package Algorithms.InterpolationSearch;

public class InterpolationSearch {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
        int target = 16;

        int result = interpolationSearch(a, target);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found");
        }
    }

    private static int interpolationSearch(int[] a, int target) {

        int low = 0;
        int high = a.length - 1;

        while (target >= a[low] && target <= a[high] && low <= high) {
            int probe = low + (high - low) * (target - a[low]) / (a[high] - a[low]);

            System.out.println("Probe: " + probe);

            if (a[probe] < target) {
                low = probe + 1;
            } else if (a[probe] > target) {
                high = probe - 1;
            } else {
                return probe;
            }
        }
        return -1;
    }
}
