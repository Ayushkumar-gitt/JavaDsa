package A2Z.Array;

import java.util.*;

public class Medium {
    public static void main(String[] args) {
        int[] nums = {2,1,5,6,2,3};
//        System.out.println(Arrays.toString(getConcatenation(nums)));
//        System.out.println(longestConsecutive(nums));
//        System.out.println(findClosestNumber(nums));
//        System.out.println(smallestIndex(nums));
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        rotate2D(matrix);
//        majorityElement2(nums);
        System.out.println(largestRectangleArea(nums));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredValue = target - nums[i];
            if (map.containsKey(requiredValue)) {
                int requiredIdx = map.get(requiredValue);
                return new int[]{i, requiredIdx};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int i = 0;
        while (i < nums.length) {
            ans[i] = nums[i];
            i++;
        }
        int j = 0;
        while (i < ans.length) {
            ans[i] = nums[j];
            i++;
            j++;
        }
        return ans;
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int currentVal = map.get(nums[i]);
                currentVal++;
                map.put(nums[i], currentVal);
            } else {
                map.put(nums[i], 1);
            }
        }
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static int maxSubArray(int[] nums) { // Kadane's Algorithm
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > ans) {
                ans = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }

    public int maxProfit(int[] prices) {
        int start = 0;
        int end = start + 1;
        int ans = 0;
        while (start < prices.length - 1 && end < prices.length) {
            if (prices[start] <= prices[end]) {
                if (ans < prices[end] - prices[start]) {
                    ans = prices[end] - prices[start];
                }
                end++;
            } else if (prices[start] >= prices[end]) {
                start = end;
                end++;
            }
        }
        return ans;
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int longest = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                count++;
                longest = Math.max(longest, count);
            } else if (nums[i + 1] != nums[i]) {
                count = 1;
            }
        }
        return longest;
    }

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];
        int distance = 0;

        for (int i = 0; i < nums.length; i++) {
            distance = Math.abs(nums[i]);
            if (distance < Math.abs(closest)) {
                closest = nums[i];
            } else if (distance == Math.abs(closest)) {
                closest = Math.max(closest, nums[i]);
            }
        }

        return closest;
    }

    public static int smallestIndex(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int value = 0;
            int num = nums[i];
            while (num > 0) {
                value += num % 10;
                num = num / 10;
            }
            if (value == i) {
                ans = Math.min(value, ans);
            }
        }
        if (ans == 2147483647) return -1;
        return ans;
    }

    public static void rotate2D(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
//        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            int start = 0;
            int end = cols - 1;

            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

//        printing array
        for (int i = 0; i < matrix.length; i++) {
            // Inner loop iterates through columns of the current row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }

    public static List<Integer> majorityElement2(int[] nums) { // Unsolved
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int count = 1;
        if (nums.length/3==0) {
            for (int i = 0; i < nums.length; i++) {
                ans.add(nums[i]);
            }
            return ans;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
//                System.out.println(nums.length/3);
                if (count >= nums.length / 3) {
                    ans.add(nums[i]);
                }
            } else {
                count = 1;
            }
        }
        return ans;
    }
    public static int largestRectangleArea(int[] heights) { // Correct But TLE
        int maxSize = heights[0];
        for (int i = 0; i < heights.length; i++) {
            int prevStop = i;
            int nextStop = i;

            while (prevStop>0 && heights[prevStop-1]>=heights[i]){
                prevStop--;
            }
            while (nextStop<heights.length-1 && heights[nextStop+1]>=heights[i]){
                nextStop++;
            }
            int width = nextStop-prevStop +1;
            int area = heights[i]*width; // heights[i] because vo khud smallest h , usse smallest agar h to waise bhi hm usko select nhi kr rhe
            if (maxSize<area){
                maxSize = area;
            }
        }
        return maxSize;
    }
}
