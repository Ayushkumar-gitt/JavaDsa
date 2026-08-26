package A2Z.Array;

import java.util.*;

public class Easy {
    public static void main(String[] args) {
        int nums[] = {3,4,5,3,1,2};
        int nums2[] = {0, 1, 2, 4, 5, 6};
//        System.out.println(removeDuplicates(nums));
//        moveZeroes(nums);
//        System.out.println(Arrays.toString(unionArray(nums,nums2)));
//        System.out.println(missingNumber(nums2));
//        rotate(nums,2);
        String s = "abceafg";
//        StringSegmentation(s);
//        check(nums);
    }

    public static int secondLargestElement(int[] nums) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                int temp = nums[j + 1];
                nums[j + 1] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j + 1;
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int[] unionArray(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length]; // 1 2 3 4 5  1 2 7
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return Arrays.stream(mix).distinct().toArray();
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == nums.length) i++;

            if (nums[i] != i) {
                int correctIdx = nums[i];

                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    //    public static int longestSubarray(int[] nums, int k) {
//
//    }

    public static boolean check(int[] nums) {
        int val = -1;
//        int val = -1;
        for(int i = 0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]>nums[i+1]){
                val = i;
            }
        }

        if (val != -1) {
            rotate(nums, nums.length - 1 - val);
        }

        if (nums == null || nums.length <= 1) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void StringSegmentation(String s){
        List<String> ansArray = new ArrayList<>();
        int cutIdx = -1;
        int start = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),i);
        }
        for (int i = 0; i < s.length(); i++) {
            cutIdx = Math.max(cutIdx, map.get(s.charAt(i)));
            if (i == cutIdx){
                ansArray.add(s.substring(start, cutIdx+1));
                start = i + 1;
            }
        }
        System.out.println(ansArray);
    }

}
