public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 11 };
        int[] ans = twoSum(arr, 10);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int val1 = -1;
        int val2 = -1;
        // int k = 0;
        for (int i = 0; i < nums.length; i++) {
            val1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                val2 = nums[j];
                if (val1 + val2 == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}