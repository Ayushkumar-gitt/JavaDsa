public class Leetcode414 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        int currMax = Integer.MIN_VALUE;
        int secondMax =Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>currMax ) {
                currMax = nums[i];
            }
            if (nums[i]!=currMax && nums[i]>secondMax) {
                secondMax = nums[i];
            }
            if (nums[i]!=secondMax && nums[i]>thirdMax && nums[i]!=currMax) {
                thirdMax = nums[i];
            }
        }
        if (thirdMax<0) {
            return secondMax;
        }
        else if (secondMax<0) {
            return currMax;
        }
        return thirdMax;
    }
}
