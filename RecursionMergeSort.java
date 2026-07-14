import java.util.Arrays;

public class RecursionMergeSort {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 8, 1 };
        int ans[] = mergeSortDivideInplace(arr,0,arr.length-1);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortDivide(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergeSortDivide(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSortDivide(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeSortConquer(left, right);

    }

    public static int[] mergeSortDivideInplace(int arr[],int start,int end) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = (start+end)/ 2;
        int left[] = mergeSortDivideInplace(arr,start,mid);
        int right[] = mergeSortDivideInplace(arr,mid,end);

        return mergeSortConquer(left, right);

    }

    public static int[] mergeSortConquer(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length&&j<right.length) {
            if (left[i]<right[j]) {
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            mix[k] = left[i];
            i++;
        }
        while (j<right.length) {
            mix[k] = right[j];
            j++;
        }
        return mix;
    }
}
