public class Leet26 {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
    public static void removeDuplicates(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                // nums[]
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
