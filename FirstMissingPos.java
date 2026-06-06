import java.util.ArrayList;
import java.util.List;

public class FirstMissingPos { // Leetcode 41
    public static void main(String[] args) {
        int[] nums = { 1,1 };
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        int n = arr.length;
        // List<Integer> arrList = new ArrayList<>();
        while (i <= n - 1) {
            int correctidx = arr[i] - 1;
            if (arr[i] < 1 || arr[i] > arr.length) {
                i++;
            } else if (arr[i] == i + 1 || arr[i] == arr[correctidx]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correctidx];
                arr[correctidx] = temp;
            }
        }
        // System.out.println(Arrays.toString(arr));
        int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return ans;
    }
}
