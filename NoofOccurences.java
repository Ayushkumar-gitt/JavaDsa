public class NoofOccurences {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 1,5,2,6};
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted == false) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
        maxFreqSum("successes");
    }
    public static int maxFreqSum(String s) { //leetcode 3541
        char[] arr = s.toCharArray(); // here string is getting breaked into char array

        int maxVowel = 0, maxConsonant = 0;
        String vowels = "aeiou";

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (vowels.indexOf(arr[i]) != -1) {
                    maxVowel = Math.max(maxVowel, count);
                } else {
                    maxConsonant = Math.max(maxConsonant, count);
                }
            }
        }

        return maxConsonant+maxVowel; // Output: 6
    }
}