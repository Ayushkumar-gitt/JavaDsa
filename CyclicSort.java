import java.util.Arrays;

public class CyclicSort {
    public static void cyclicSort() {
        // int arr[] = { 19, 2, 17, 1, 8, 3, 6, 10, 15, 11, 4, 14, 20, 9, 13, 5, 16, 12, 18, 7 };
        int arr[] = {2,4,3,1,5};
        int i = 0;

        while (i <= arr.length - 1) {
            int index = arr[i] - 1;
            if (arr[i] != i + 1) { // swap it with arr[i]-1 th element
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
            // if (arr[i] == i + 1) {
            //     i++;
            // }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        cyclicSort();
    }
}
