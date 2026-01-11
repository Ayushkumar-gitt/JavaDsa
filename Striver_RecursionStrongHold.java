public class Striver_RecursionStrongHold {
    public static void main(String[] args) {
//        String s = "0-1";
        // myAtoi(s);
        System.out.println(myPow(2, 1000));
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String ans = s.trim();
        StringBuilder result = new StringBuilder();

        int i = 0;

        // handle sign once
        if (i < ans.length() && (ans.charAt(i) == '-' || ans.charAt(i) == '+')) {
            result.append(ans.charAt(i));
            i++;
        }

        // skip leading zeros
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        // read digits
        while (i < ans.length() && Character.isDigit(ans.charAt(i))) {
            result.append(ans.charAt(i));
            i++;
        }

        String res = result.toString();
        return Integer.parseInt(res);
    }

    public static double myPow(double x, int n) {
        if (n==0) {
            return 1;
        }
        if (n<0) {
            return 1 / myPow(x,n * -1);
        }else{
            return x*myPow(x, n-1);
        }
    }

}