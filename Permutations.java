import java.util.*;
import java.util.stream.Collectors;


public class Permutations {
    public static void main(String[] args) {
        int[] arr  = {1,1,2};
        List<List<Integer>> finalAns = permuteUnique(arr);
        for (int i = 0; i < finalAns.size(); i++) {
            System.out.println(finalAns.get(i));
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteHelper(nums,ans,0);
        return ans;
    }
    public static void permuteHelper(int[] nums,List<List<Integer>> ans,int idx){
        if (idx==nums.length){
            List<Integer> list = Arrays.stream(nums).boxed().toList(); // Converts array to a list.

            ans.add(list);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums,idx,i);
            permuteHelper(nums,ans,idx+1);
            swap(nums,idx,i);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;
    }



    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteuniqueHelper(nums,ans,0);
        return ans;
    }
    public static void permuteuniqueHelper(int[] nums,List<List<Integer>> ans,int idx){
        if (idx==nums.length){
            List<Integer> list = new ArrayList<>(nums.length);
            for (int num : nums) list.add(num); // Converts array to a list.
            ans.add(list);
            return;
        }
        Set<Integer> seen = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if (seen.contains(nums[i])) continue;
            seen.add(nums[i]);

            swap(nums,idx,i);
            permuteuniqueHelper(nums,ans,idx+1);
            swap(nums,idx,i);
        }
    }
}



