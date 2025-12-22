public class Recursion_Basic {
    public static void main(String[] args) {
        // onetoFive(5);
        
        // System.out.println(fact(5));

        // int ans = sumofDigits(1342);
        // System.out.println(ans);

        System.out.println(prodofDigits(1342));
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
    
    public static int sumofDigits(int n){
        if (n==0) {
            return 0; 
        }
        return sumofDigits(n/10) + (n%10);
    }

    public static int prodofDigits(int n){
        if (n%10==n) {
            return n; 
        }
        return prodofDigits(n/10) * (n%10);
    }
}
