package Accenture;

public class Day2 {
    public static void main(String[] args) {
        VowelsAndConsonentsCount("Accenture 2026 Drive!");
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        FrequencyCheck(arr);
    }

    public static void VowelsAndConsonentsCount(String s) {
        int vowel = 0;
        int consonent = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }

            if (ch >= 'a' && ch <= 'z' &&
                    ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                consonent++;
            }
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonents : " + consonent);
    }

    public static void FrequencyCheck(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
