public class MaximumSubarray {
    public static void main() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            if (nums[start] < 0 || sum < 0) {
                ans = nums[start];
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
}
