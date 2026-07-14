import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4}; //0,
//        int target = 6;
//        List<Integer> list = twoSumforThreeSum(arr,6);

//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        List<List<Integer>> list = threeSum(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static int[] twoSum(int[] nums, int target) { // Leetcode 1
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredVal = target - nums[i];
            if ((map.get(requiredVal)) != null) {
                int requiredIdx = map.get(requiredVal);
                return new int[]{requiredIdx, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<List<Integer>, String> duplicateChecking = new HashMap<>();

        int i = 0;
        while (i < nums.length) {
            int j = i + 1;
            HashMap<Integer, Integer> map = new HashMap<>();
            while (j < nums.length) {
                int requiredVal = -(nums[i] + nums[j]);
                if (map.get(requiredVal) != null) {
                    List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], requiredVal));
                    list.sort(null);
                    if (!ans.contains(list)) {
                        ans.add(list);
//                        duplicateChecking.put(list, "");
                    }
                } else {
                    map.put(nums[j], j);
                }
                j++;
            }
            i++;
        }
        return ans;
    }

    public static boolean isPalindrome(String s) { // Leetcode 125
        String ans = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(ans);
        for (int i = 0, j = ans.length() - 1; i < ans.length() / 2; i++) {
            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}