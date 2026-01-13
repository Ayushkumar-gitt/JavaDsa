public class Leetcode3099 {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int originalx = x;
        int sum = 0;
        while (x!=0) {
            int val1 = x%10;
            sum = sum + val1;
            x = x/10; 
        }
        if (originalx%sum==0) {
            return sum;
        }
        return -1;
    }
}
