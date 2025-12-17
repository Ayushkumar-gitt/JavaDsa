public class FindingSqrt {
    public static void main(String[] args) {
        // System.out.println(perfectSqrt(19));
        System.out.println(isPerfectSquare(808201));
    }
    public static int perfectSqrt(int n) {
        if (n == 0 || n == 1) return n;
        int start = 0;
        int end = n;
        int ans = 0;
        while (start<end) {
            int mid = (start + end)/2;
            if (mid*mid>n) {
                ans = mid; // storing the last ans
                end = mid;
            }
            else if (mid*mid<n) {
                ans = mid; // storing the last ans
                start = mid+1;
            }else{
                return mid;
            }
        }
        return ans;
    }
    public static boolean isPerfectSquare(int n) {
        if (n == 0 || n == 1) return true;
        long start = 0;
        long end = n;
        while (start<end) {
            long mid = start + (end-start)/2;
            if (mid*mid>n) {
                end = mid;
            }
            else if (mid*mid<n) {
                start = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}
