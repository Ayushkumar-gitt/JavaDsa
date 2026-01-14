public class Leetcode977 {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] ans = sortedSquares(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length-1;

        while (left <= right) {
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            if (leftsquare > rightsquare) {
                ans[k] = leftsquare;
                left++;
            } else {
                ans[k] = rightsquare;
                right--;
            }
            k--;
        }
        return ans;
    }
}
