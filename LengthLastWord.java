public class LengthLastWord {
    public static void main(String[] args) {
        LengthofLastWord("   fly me   to   the moon  ");
    }
    public static int LengthofLastWord(String s){
        String res = s.strip();
        System.out.println(res);
        String res1[] = res.split(" ");
        return res1[res1.length-1].length();
    }
}
