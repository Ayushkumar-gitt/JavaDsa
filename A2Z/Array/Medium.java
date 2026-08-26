package A2Z.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Medium {
    public static void main(String[] args) {
        int[] nums = {-4,-2,3,5};
//        System.out.println(Arrays.toString(getConcatenation(nums)));
//        System.out.println(longestConsecutive(nums));
        System.out.println(findClosestNumber(nums));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredValue = target - nums[i];
            if (map.containsKey(requiredValue)) {
                int requiredIdx = map.get(requiredValue);
                return new int[]{i, requiredIdx};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int i = 0;
        while (i<nums.length){
            ans[i] = nums[i];
            i++;
        }
        int j = 0;
        while (i<ans.length){
            ans[i] = nums[j];
            i++;
            j++;
        }
        return ans;
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int currentVal = map.get(nums[i]);
                currentVal++;
                map.put(nums[i],currentVal);
            }else{
                map.put(nums[i],1);
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
            if (sum>ans){
                ans = sum;
            }
            if (sum<0){
                sum = 0;
            }
        }
        return ans;
    }
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = start + 1;
        int ans = 0;
        while (start < prices.length - 1 && end<prices.length) {
            if (prices[start] <= prices[end]) {
                if (ans<prices[end]-prices[start]){
                    ans = prices[end]-prices[start];
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
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int longest = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i + 1] == nums[i] + 1 ){
                count++;
                longest = Math.max(longest, count);
            }else if(nums[i + 1] != nums[i]){
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
            if (distance<Math.abs(closest)){
                closest = nums[i];
            }else if (distance == Math.abs(closest)) {
                closest = Math.max(closest, nums[i]);
            }
        }

        return closest;
    }
}
