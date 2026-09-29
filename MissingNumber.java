import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MissingNumber {
    public static int cyclicSort(int arr[]) {
        int i = 0;
        while (i <= arr.length - 1) {
            int index = arr[i]-1;
            if (arr[i] < arr.length && arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans = j;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 1};
        System.out.println("Missing element : " + cyclicSort(arr));
    }

}
