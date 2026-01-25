import java.util.ArrayList;

public class RecursionSubsequences {
    public static void main(String[] args) {
        // subsequences("", "abc");
        // System.out.println(subsequencesList("", "ahbgdc"));
        System.out.println(isSubsequence("axc", "abcde"));
        String[] words = {"a","bb","acd","ace"};
        numMatchingSubseq("abcde",words );
    }

    public static void subsequences(String processed, String unprocessed) {
        if (unprocessed.length() == 0) {
            System.out.println(processed);
            return;
        }
        subsequences(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subsequences(processed, unprocessed.substring(1));
    }
    
    public static ArrayList<String> subsequencesList(String processed, String unprocessed) {
        if (unprocessed.length() == 0) {
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
        
        while (i<words.length) {
            if (isSubsequence(words[i],s)==true) {
                count++;
            }
            i++;
        }
        return count;
    }
}
