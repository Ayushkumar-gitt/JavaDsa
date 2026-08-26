package A2Z.String;

public class Easy {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

//    public static String largestOddNumber(String num) {

    /// /        if (num.charAt(num.length() - 1) % 2 != 0)
//
//            for (int i = 0; i < num.length(); i++) {
//
//            }
//    }
    public static String reverseWords(String s) { // You can also use StringBuilder instead of String to be the solution more optimized.
        s = s.strip();
        String output = "";
        int i = s.length() - 1;
        int j = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            output = output + s.substring(i+1, j + 1);
            output = output + " ";
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return output.trim();
    }
}
