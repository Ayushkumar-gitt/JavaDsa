import java.util.ArrayList;

public class RecursionSubsequences {
    public static void main(String[] args) {
        // subsequences("", "abc");
        System.out.println(subsequencesList("", "ahbgdc"));
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
}
