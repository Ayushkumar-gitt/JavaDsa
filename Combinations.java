import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        List<List<Integer>> list = combine(5,3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            nums.add(i);
        }
        List<Integer> list = new ArrayList<>();
        combineHelper(nums,finalAns,list,0,k);
        return finalAns;
    }

    public static void combineHelper(List<Integer> nums,List<List<Integer>> finalAns,List<Integer> list,int start,int k){
        if (list.size()==k){
            finalAns.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < nums.size(); i++) {
            list.add(nums.get(i));
            combineHelper(nums,finalAns,list,i+1,k);
            list.remove(list.size() - 1);               
        }
        }
    }

