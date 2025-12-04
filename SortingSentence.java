// Not solved yet
public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        SortingTheSentence(s);

    }

    public static void SortingTheSentence(String s) {
        String ans = "";
        String[] ar = s.split(" ");
        for (int i = 1; i < ar.length; i++) {
            String search  = String.valueOf(i);
            if (ar[i].contains(search)) {
                System.out.println("Letter found! at " + i);
                ans.concat(ar[i]);
            }
        }

        for (String string : ar) {
            System.out.println(string);
        }
        System.out.println("Ans = " + ans);
    }
}
