public class RecursionString {
    public static void main(String[] args) {
        String s = "ayushapplayushraj";
        String ans = "";
        System.out.println(charRemoving(s, ans, 0));
        System.out.println(appleRemoving(s, ans, 0));
        System.out.println(skipAppnotApple(s));
        // System.out.println(makeFancyString(s));
    }
    public static String charRemoving(String original , String ans , int i) {
        if (i==original.length()) {
            return ans;
        }
        if (original.charAt(i)=='a') {
            return charRemoving(original , ans, i+1);
        }else{
            return charRemoving(original , ans+original.charAt(i), i+1);
        }
    }

   public static String appleRemoving(String original, String ans, int i) {
    if (i == original.length()) {
        return ans;
    }

    if (i + 5 <= original.length() && original.startsWith("apple", i)) {
        return appleRemoving(original, ans, i + 5);
    } else {
        return appleRemoving(original, ans + original.charAt(i), i + 1);
    }
}
    public static String skipAppnotApple(String original){
        if (original.isEmpty()) {
            return "";
        }
        if (!original.startsWith("apple") && original.startsWith("app")) {
            return skipAppnotApple(original.substring(3));
        }else{
            return original.charAt(0) + skipAppnotApple(original.substring(1));
        }
    }
    
    public static String makeFancyString(String s) { // leet 1957 // Fails in leetcode due to using string instead use String builder to optimize the code to get better time complexity for leetcode submission. See own leetcode summision of this question for optimized answer.
        
        String ans = "";
        int count = 1;
        for (int i = 0; i <s.length(); i++) {
            if (i+1==s.length()) {
                ans = ans + s.charAt(i);
                break;
            }
            if (count<3) {
                ans = ans + s.charAt(i);
            }
            if (s.charAt(i)==s.charAt(i+1)) {
                count++;
            }else{
                count = 1;
            }

        }
        return ans;
    }
    
}
