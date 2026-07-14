import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionSubsequences {
    public static void main(String[] args) {
//         subsequences("", "123");
//         subsets_leetcode90("","122");
//        System.out.println(subsequencesList("", "123"));
//        System.out.println(isSubsequence("axc", "abcde"));
//        String[] words = {"a","bb","acd","ace"};
//        numMatchingSubseq("abcde",words );
//        int[] arr = {1, 2, 3, 4};
//        subsequencesIteration(arr);
        int[] nums = {1,2,3};
//        List<List<Integer>> list = subsets(nums);

//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.get(i).size(); j++) {
//                System.out.print(list.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
    }
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(subsetsHelper(new ArrayList<>(),nums));
//
//        return list;
//    }

//    public static List<Integer> subsetsHelper(List<Integer> ans ,int[] arr){
//        if(arr.length==0) return ans;
//
//        subsetsHelper(new ArrayList<>(ans) {{
//            add(arr[0]);
//        }}, Arrays.copyOfRange(arr,1,arr.length));
//
//        subsetsHelper(ans,Arrays.copyOfRange(arr,1,arr.length));
//    }



    public static void subsequences(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        subsequences(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subsequences(processed, unprocessed.substring(1));
    }

    public static ArrayList<String> subsequencesList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> right = subsequencesList(processed + unprocessed.charAt(0), unprocessed.substring(1));
        ArrayList<String> left = subsequencesList(processed, unprocessed.substring(1));

        right.addAll(left);
        return right;
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static int numMatchingSubseq(String s, String[] words) {
        int i = 0;
        int count = 0;

        while (i < words.length) {
            if (isSubsequence(words[i], s) == true) {
                count++;
            }
            i++;
        }
        return count;
    }

    static ArrayList<int[]> ans = new ArrayList<>();

//    public static void subsequencesIteration(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int[] v = {arr[i]};
//            ans.add(v);
//        }
//        int s = 0;
//        int e = arr.length - 1;
//        while (s < e) {
//            while (s < e) {
//                int[] insideArray = {arr[s], arr[e]};
//                ans.add(insideArray);
//                e--;
//            }
//            s++;
//            e = arr.length - 1;
//        }
//        ans.add(arr);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(Arrays.toString(ans.get(i)));
//        }
//    }
}
