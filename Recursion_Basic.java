public class Recursion_Basic {
    public static void main(String[] args) {
        // onetoFive(5);

        // System.out.println(fact(5));

        // int ans = sumofDigits(1342);
        // System.out.println(ans);

        // System.out.println(prodofDigits(1342));

        // rav(1824);
        // System.out.println(isPalindrome(10));
        // System.out.println(noOfZeros(10220));
        System.out.println(noOfZerosRec(302014014, 0));
    }

    public static void onetoFive(int n) {
        if (n == 0) {
            return;
        }
        onetoFive(n - 1);
        System.out.println(n);
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int sumofDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return sumofDigits(n / 10) + (n % 10);
    }

    public static int prodofDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return prodofDigits(n / 10) * (n % 10);
    }

    public static void rav(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        rav(n / 10);
    }

    public static boolean isPalindrome(int n) {
        String num = String.valueOf(n);
        int start = 0;
        int end = num.length() - 1;

        while (start <= end) {
            if (num.charAt(start) != num.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int noOfZeros(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 10 == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static int noOfZerosRec(int n, int count) {
        if (n==0) {
            return count;
        }
        if (n % 10 == 0) {
            return noOfZerosRec(n/10, ++count);
        }
        return noOfZerosRec(n/10, count);
    }
}
