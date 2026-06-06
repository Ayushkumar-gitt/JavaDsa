import java.util.Arrays;

public class DuplicateNo_leet287 {
    public static void main(String[] args) {
        int arr[] = { 3,1,3,4,2 };
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i <= n - 1) {
            int correctidx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[i] == arr[correctidx]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correctidx];
                arr[correctidx] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        // int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }
} 