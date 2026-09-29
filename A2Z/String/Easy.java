package A2Z.String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Easy {
    public static void main(String[] args) {
//        System.out.println(reverseWords("a good   example"));
//        System.out.println(largestOddNumber("52"));
        String[] strs = {"dog", "racecar", "car"};
//        System.out.println(longestCommonPrefix(strs));
        String s = "abcde", t = "abced";
//        System.out.println(isAnagram(s,t));
        System.out.println(rotateString(s, t));
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static String reverseWords(String s) { // You can also use StringBuilder instead of String to be the solution more optimized.
        s = s.strip();
        String output = "";
        int i = s.length() - 1;
        int j = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            output = output + s.substring(i + 1, j + 1);
            output = output + " ";
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return output.trim();
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            ans = commonChars(ans, strs[i + 1]);
        }
        return ans;
    }

    public static String commonChars(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (!(s1.charAt(i) == s2.charAt(i))) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, n);
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }

        return map.equals(map2);
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }
    public static int maxDepth(String s) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') count++;
            if (s.charAt(i)==')') count--;

            if (count>ans){
                ans = count;
            }
        }
        return ans;
    }
}
