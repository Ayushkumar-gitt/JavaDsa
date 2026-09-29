package Accenture;

import java.util.List;
import java.util.*;

public class PYQ {
    public static void main(String[] args) {
//        eqiSum(112);
//        System.out.println(solve_optimal("aaabbbccc"));
        System.out.println(solution("apple    ant banana       apple ant"));
    }
// ae at
    public static int solve(String s) {
        int n = (int) Math.sqrt(s.length());
        char[][] grid = new char[n][n];

        int k = 0; // String pointer

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(k);
                k++;
            }
        }

        int count = 0; // Counts how many rows or column have same elements

        for (int i = 0; i < n; i++) {
            boolean same = true;
            char first = grid[i][0];

            for (int j = 1; j < n; j++) {
                if (grid[i][j] != first) {
                    same = false;
                    break;
                }
            }
            if (same) {
                count++;
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            boolean same = true;
            char first = grid[0][j];

            for (int i = 1; i < n; i++) {
                if (grid[i][j] != first) {
                    same = false;
                    break;
                }
            }
            if (same) {
                count++;
            }
        }
        return count;
    }

    public static int solve_optimal(String s) {

            int n = (int) Math.sqrt(s.length());
            int count = 0;

            // Check rows
            for (int i = 0; i < n; i++) {

                int start = i * n;
                char first = s.charAt(start);

                boolean same = true;

                for (int j = 1; j < n; j++) {
                    if (s.charAt(start + j) != first) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    count++;
                }
            }

            // Check columns
            for (int j = 0; j < n; j++) {

                char first = s.charAt(j);
                boolean same = true;

                for (int i = 1; i < n; i++) {

                    if (s.charAt(i * n + j) != first) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    count++;
                }
            }

            return count;
    }

    public static List<String> solution(String s){
        String[] words = s.trim().split("\\s+");
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = String.valueOf(words[i].charAt(0)) + words[i].charAt(words[i].length()-1);
//            System.out.println(word);
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }

        List<String> key = new ArrayList<>(map.keySet());
        List<Integer> value = new ArrayList<>(map.values());

        List<String> result = new ArrayList<>();

        int maxFreq = Collections.max(value);

        for(int i = 0;i<key.size();i++){
            if (value.get(i)==maxFreq){
                result.add(key.get(i));
            }
        }
//        System.out.println(value);
        System.out.println("max - "  + maxFreq);
        return result;
    }
}
