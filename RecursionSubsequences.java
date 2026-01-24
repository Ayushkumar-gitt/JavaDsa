public class RecursionSubsequences {
    public static void main(String[] args) {
        subsequences("", "abc");
    }

    public static void subsequences(String processed, String unprocessed) {
        if (unprocessed.length() == 0) {
            System.out.println(processed);
            return;
        }
        subsequences(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subsequences(processed, unprocessed.substring(1));
    }
}
