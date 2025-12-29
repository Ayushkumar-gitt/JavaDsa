public class RecursionArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 5, 7, 7, 7, 8, 12, 13, 15, 15, 15, 19 };
        // System.out.println(checkSortedArray(arr));
        // System.out.println(linearSearch(arr, 15, 0));

    }

    // GFG - check if array is sorted.
    public static boolean checkSortedArray(int arr[]) {
        return checkSortedArrayHelper(arr, 0);
    }

    public static boolean checkSortedArrayHelper(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && checkSortedArrayHelper(arr, ++index);
    }

    public static int linearSearch(int arr[], int target, int i) {
        if (arr == null || i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }

        return linearSearch(arr, target, i + 1);

    }
}
