package A2Z.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Medium {
    public static void main(String[] args) {
//        System.out.println(frequencySort("babad"));
        System.out.println(longestPalindrome("cbbd"));
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
        return s.substring(i+1,j);
    }
}
