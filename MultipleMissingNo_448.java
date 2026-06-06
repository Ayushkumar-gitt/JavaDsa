import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleMissingNo_448 {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = findDisappearedNumbers(arr);
        for (Integer val : ans) {
            System.out.print(val + " ");
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        int n = arr.length;
        List<Integer> arrList = new ArrayList<>();
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
        // System.out.println(Arrays.toString(arr));
        // int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                arrList.add(j + 1);
            }
        }
        return arrList;
    }
}
