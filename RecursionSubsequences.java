public class RecursionSubsequences {
    public static void main(String[] args) {
        subsequences("", "abc");
    }
    public static void subsequences(String processed , String unprocessed){
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subsequences(processed + ch, unprocessed.substring(1));
        subsequences(processed, unprocessed.substring(1));
    }
}
