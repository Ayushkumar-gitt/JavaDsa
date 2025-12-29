public class StringArrayEqvi {
    public static void main(String[] args) {
        String word1[] = {"ab", "c"};
        String word2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        
        for (int i = 0; i < word1.length; i++) {
            res1.append((word1[i]));
        }
        for (int i = 0; i < word2.length; i++) {
            res2.append((word2[i]));
        }
        boolean areEqual = res1.toString().equals(res2.toString());
        if (areEqual) {
            return true;
        }else{
            return false;
        }
    } 

}
