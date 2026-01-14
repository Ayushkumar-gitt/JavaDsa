public class Leetcode905 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int[] ans = sortArrayByParity(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int ieven = 0;
        int iodd = 0;
        int j = 0;
        while (ieven<nums.length) {
            if (nums[ieven]%2==0) {
                ans[j] = nums[ieven];
                j++;
            }
            ieven++;
        }
        while (iodd<nums.length) {
            if (nums[iodd]%2!=0) {
                ans[j] = nums[iodd];
                j++;
            }
            iodd++;
        }
        return ans;
    }
}
