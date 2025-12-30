import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
