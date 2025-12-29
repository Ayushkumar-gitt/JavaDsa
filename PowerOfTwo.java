public class PowerOfTwo {
    public static void main(String[] args) {
        powerOfTwo(15);
    }
    public static boolean powerOfTwo(int n) {
        if (n<=0) { // less than equal to zero because then it will also check for negative numbers.
            return false;
        }
        boolean ans = (n&(n-1))==0;
        return ans;
    }
}
