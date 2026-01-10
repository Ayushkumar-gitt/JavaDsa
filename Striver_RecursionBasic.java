public class Striver_RecursionBasic {
    public static void main(String[] args) {
        // System.out.println(NnumbersSum(4));
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static int NnumbersSum(int N) {
        if(N==1){
            return 1;
        }
        return N + NnumbersSum(N-1);
    }
    public static boolean isPalindrome(String s) {
        String ans = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(ans);
        for (int i = 0,j = ans.length()-1; i <ans.length()/2; i++) {
            if (ans.charAt(i)!=ans.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
