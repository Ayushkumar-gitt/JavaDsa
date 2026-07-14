import java.util.ArrayList;
import java.util.List;

public class Subset_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> finalans = subsets(arr);
        for (int i = 0; i < finalans.size(); i++) {
            System.out.println(finalans.get(i));
        }
    }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        subsetsHelper(nums,0,ans,new ArrayList<>());
        return ans;
    }

    public static void subsetsHelper(int[] nums,int i,List<List<Integer>> ans,List<Integer> list) {
        if (i==nums.length){
            ans.add(list);
            return;
        }


        int next = i + 1;
        while (next < nums.length && nums[next] == nums[i]) { // exclude nums[i] AND all of its duplicates
            next++;
        }

        subsetsHelper(nums,next,ans,new ArrayList<>(list)); // Not included current nums[i] value , nya list banao and purane list to usme dal ke pass krdo no changes

        List<Integer> includingCurrent = new ArrayList<>(list); // nya list bna kr
        includingCurrent.add(nums[i]); // current value usme add krdiya , aab niche pass ho jayega ✅


        subsetsHelper(nums,i+1,ans,includingCurrent); // Included current nums[i] value , nya list banao and usme current nums[i] ki value daal ke then pass kro
    }
}
