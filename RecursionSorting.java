import java.util.Arrays;

public class RecursionSorting {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 8, 1 };
        // selectionSort(arr, 0, 0,arr.length-1);
        // bubbleSort(arr, 0, arr.length - 1);
        // int ans[] = mergeSort(arr);
        mergeSortInplace(arr, 0, arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int arr[], int i, int endindex) {
        if (endindex == 0) {
            return;
        }

        if (i < endindex) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubbleSort(arr, i + 1, endindex);
        } 
        else {
            bubbleSort(arr, 0, endindex - 1);
        }

    }

    public static void selectionSort(int arr[], int largestElement, int index, int endindex) {
        if (endindex == 0) {
            return;
        }
        if (index <= endindex) {
            if (arr[index] > arr[largestElement]) {
                largestElement = index;
            }
            selectionSort(arr, largestElement, index + 1, endindex);
        } else {
            int temp = arr[largestElement];
            arr[largestElement] = arr[endindex];
            arr[endindex] = temp;
            selectionSort(arr, 0, 0, endindex - 1);
        }
    }
     
    public static int[] mergeSort(int arr[]) {
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
        
    }

    private static int[] merge(int[] left, int[] right) {
        int mix[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length) {
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
            k++;
        }
        while (j<right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void mergeSortInplace(int arr[],int si , int ei){
        if (si>=ei) {
            return;
        }
        int mid = (si+ei)/2;
        mergeSortInplace(arr, si, mid);
        mergeSortInplace(arr, mid+1, ei);
        mergeInplace(arr,si,mid,ei);
    }

    private static void mergeInplace(int[] arr, int si, int mid, int ei) {
        int merged[] =  new int[ei-si+1];
        int i0 = si;
        int i1 = mid+1;
        int i2 = 0;
        while (i0<=mid && i1<=ei) {
            if (arr[i0]<=arr[i1]) {
                merged[i2] = arr[i0];
                i2++;
                i0++;
            }else{
                merged[i2] = arr[i1];
                i2++;
                i1++;
            }
        }
        while (i0<=mid) {
            merged[i2] = arr[i0];
                i2++;
                i0++;
        }
        while (i1<=ei) {
            merged[i2] = arr[i1];
                i2++;
                i1++;
        }
        for (int i = 0,j = si; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }
}
