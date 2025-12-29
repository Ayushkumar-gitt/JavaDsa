public class Factors {
    public static void main(String[] args) {
        factor2(20);
    }
    public static void factor(int n){ // TC - O(n) and SC - O(1)
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }
    }

    // TC - O(sqrt(n)) which is less than n so less time complexity and space will be same here only which is O(1) cause no extra space is being used
    public static void factor2(int n) { 
        int sqrt = (int)Math.sqrt(n);
        for (int i = 1; i <=sqrt ; i++) {
            if (n%i==0) {
                System.out.print(i + " " + n/i+ " ");
            }
        }
    }
}
