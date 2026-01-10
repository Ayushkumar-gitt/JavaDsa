import java.util.Arrays;

public class Leetcode88 {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        int merged[] = mergesort(nums1, nums2, m, n);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
            // System.out.print(nums1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        nums1 = mergesort(nums1, nums2, m, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    private static int[] mergesort(int[] left, int[] right, int m, int n) {
        int mix[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < n) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
