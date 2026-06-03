import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort() {
        boolean swapped;
        int arr[] = { 5, 3, 0, 4, 2 };
        for (int i = 0; i <= arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j <= arr.length - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) { // If at any inner loop iteration the swap is not performed means the array is
                                    // completely sorted , so no furter sorting is required (Even if outer if break
                                    // condition is not completed) , so the isSwapped stays false and this If
                                    // condition runs and program breaks out of loop , this makes the program more
                                    // efficient and time saving
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        bubbleSort();
    }
}
