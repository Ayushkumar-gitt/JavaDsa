import java.util.Arrays;
import java.util.HashMap;

public class Revision {
    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(Arrays.toString( twoSum(nums,6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> list = new HashMap<>();

        for (int i = 0;i<nums.length;i++){
            int requiredValue = target-nums[i];

            if (list.containsKey(requiredValue)){
                int idx = list.get(requiredValue);
                return new int[]{idx,i};
            }else{
                list.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
