import java.util.ArrayList;

public class RecursionArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 5, 7, 7, 7, 8, 12, 13, 15, 15, 15, 19 };
        //  System.out.println(checkSortedArray(arr));
        //  System.out.println(linearSearch(arr, 15, 0));
        System.out.println(findAllIndex2(arr, 13, 0));

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
    public static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list) {
        if (index==arr.length) {
            return list;
        }
        if (target==arr[index]) {
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    public static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index==arr.length) {
            return list;
        }
        if (target==arr[index]) { // tjos answer will remain in that function call only.
            list.add(index);
        }
        // storing the answer of each funciton call and adding them in list when backtracking;
        ArrayList<Integer> valueFrombelowCall = findAllIndex2(arr, target, index+1); 
        list.addAll(valueFrombelowCall); 
        return list;
    }
}
