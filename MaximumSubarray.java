import java.util.HashMap;

public class MaximumSubarray {
    public static void main() {
        int[] nums = {-3, -2, -1};
        String s = "abcabcbb";
//        System.out.println(maxSubArray(nums));
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int maxSubArray(int[] nums) {
        int ans = nums[0]; // Even if there's a single element in the array , it will be returned as answer.
        int sum = 0;
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            if (nums[start] < 0 || sum < 0) {
                ans = Math.max(ans, nums[start]);
                sum = 0;
                start++;
                end = start;
            } else {
                sum = sum + nums[end];
                if (ans < sum) {
                    ans = sum;
                }
                end++;
            }
        }
        return ans;
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int ans = 0;

        while (end < s.length()) {
            Character currChar = s.charAt(end);

             if ((map.containsKey(currChar)) && map.get(currChar) >= start) {
                start = map.get(currChar) + 1;
            }else{
                 map.put(currChar,end);
                 if (ans<(end-start)){
                     ans = end-start;
                 }
                 end++;
             }
        }
        return ans+1;
    }
}
