public class PrimeCheck {
    public static void main(String[] args) {
        // System.out.println(primeCheck(23));
        allPrimeNo(40);
    }

    public static boolean primeCheck(int n) {
        if (n <= 1 || n % 2 == 0) {
            if (n == 2) {
                return true;
            }
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void allPrimeNo(int n) { // All prime numbers that are less than equal to n.
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + primeCheck(i));
        }
    }
}
