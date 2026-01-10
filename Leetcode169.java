import java.util.Arrays;

public class Leetcode169 {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2}; // 
        System.out.println(majorityElement(nums));
        // System.out.println(containsDuplicate(nums));
    }

    public static int majorityElement(int[] nums) { // Self designed solution.
        Arrays.sort(nums);
        int count = 1;
        if (nums.length==1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                count++;
                if (count>nums.length/2) {
                    return nums[i];
                }
            } else{
                count = 1;
            }
        }
            return -1;
    }

    public int majorityElement_Impresive(int[] nums) { // Out of the box thinking solution.. Link for solution explaination - https://chatgpt.com/s/t_69623d7c5c508191a2837637dddb349e
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
