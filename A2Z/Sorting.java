package A2Z;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 1, 1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(selectionSort(arr)));
//        System.out.println(Arrays.toString(quickSort(arr)));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int largestElement = Integer.MIN_VALUE;
            int largestElemIdx = -1;
            for (int j = 0; j <= nums.length - i - 1; j++) {
                if (nums[j] > largestElement) {
                    largestElement = nums[j];
                    largestElemIdx = j;
                }
            }
            int temp = largestElement;
            nums[largestElemIdx] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        return nums;
    }
    public static int[] quickSort(int[] nums) {
        return quickSortHelper(nums,0, nums.length - 1);
    }
    public static int[] quickSortHelper(int[] nums, int low, int high) {
        int i = low;
        int j = high;
        if (j < i) {
            return new int[]{nums[0]};
        }
        while (i < j) {
            int pivot = nums[low];
            while (nums[i] <= pivot && i < high) {
                i++;
            }
            while (nums[j] >= pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp2 = nums[low];
        nums[low] = nums[j];
        nums[j] = temp2;

        quickSortHelper(nums, low, j - 1);
        quickSortHelper(nums, j + 1, high);
        return nums;
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length==1) return nums;
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }

    public static int[] merge(int[] left,int[] right){
        int[] mix = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length){
            if (left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k]= right[j];
                j++;
            }
            k++;
        }

        while (i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
