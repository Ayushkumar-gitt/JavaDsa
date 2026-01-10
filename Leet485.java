public class Leet485 {
    public static void main(String[] args) {
        int nums[] = {2,1,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int finalcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                finalcount = Math.max(finalcount, count);
            }else{
                count = 0;
            }
        }
        return finalcount;
    }
}
