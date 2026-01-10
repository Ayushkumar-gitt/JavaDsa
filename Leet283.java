public class Leet283 {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 0, 0, 12 };
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) { // This is an optimized two pointer solution for this code (easily understandable)
        int currentzero = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=0) {
                int temp = nums[currentzero];
                nums[currentzero] = nums[j];
                nums[j] = temp;
                currentzero++;
            }
        }   
    } // this problem can also be solved using bubble sort or other sorting algos , but it will give higher TC
}
