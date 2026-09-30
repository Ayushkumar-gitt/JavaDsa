package A2Z.String;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.reflect.Array.get;

public class Medium {
    public static void main(String[] args) {
//        System.out.println(frequencySort("babad"));
//        System.out.println(longestPalindrome("cbbd"));
//        System.out.println(beautySum("aabcb"));;
        System.out.println(minAddToMakeValid("())"));
    }

    public static String frequencySort(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String currchar = String.valueOf(s.charAt(i));

            if (map.containsKey(currchar)) {
                map.put(currchar, map.get(currchar) + 1);
            } else {
                map.put(String.valueOf(s.charAt(i)), 1);
            }
        } // Till here number of character occurring is counted.


        StringBuilder ans = new StringBuilder();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        ans.append(entry.getKey());
                    }
                });

        return ans.toString();
    }

    public static String longestPalindrome(String s) {
        int mid = s.length() / 2;
        int i = mid, j = mid;
        while (i > 0 && j < s.length() - 1 && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i + 1, j);
    }

    public static int beautySum(String s) {
        int beautySum = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }

                int max = Collections.max(map.values());
                int min = Collections.min(map.values());

                beautySum += max - min;
            }
        }
        return beautySum;
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char word = s.charAt(i);
            if (word==')'){
                if (!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.add(word);
                }
            }else{
                stack.add(word);
            }
        }
        return stack.size();
    }
}
