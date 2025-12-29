//Leetcode - 1616
//Not right approach

public class SplitToPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindromeFormation("abdef", "fecab"));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        if (a.length()==1&&b.length()==1) {
            return true;
        }
        String a_pre;
        String a_suff;
        String b_suff;
        String b_pre;
        if (a.length()%2==0) {
            a_pre = a.substring(0, a.length()/2);
            a_suff = a.substring( a.length()/2,a.length());
        
            b_pre = b.substring(0, a.length()/2);
            b_suff = b.substring( a.length()/2,a.length());
        }else{
            a_pre = a.substring(0, a.length()/2);
            a_suff = a.substring( a.length()/2,a.length());
        
            b_pre = b.substring(0, (a.length()/2)+1);
            b_suff = b.substring( (a.length()/2)+1,a.length());
            System.out.println("je;");
        }

        String b_rev  = "";
        String rev_bsuff = "";
        String rev_asuff = "";

        for(int i = b_suff.length()-1;i>=0;i--){
            rev_bsuff = rev_bsuff + b_suff.charAt(i);
        }
        for(int i = a_suff.length()-1;i>=0;i--){
            rev_asuff = rev_asuff + a_suff.charAt(i);
        }

        boolean areEqual = a_pre.toString().equals(rev_bsuff.toString());
        boolean areEqual2 = b_pre.toString().equals(rev_asuff.toString());
        
        if (areEqual||areEqual2) {
            return true;
        }else{
            return false;
        }
    }
}
