package Accenture;

public class Day9 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        return climbStairsHelp(n,0,0);
    }
    public static int climbStairsHelp(int n , int sum,int count){
        if (sum>=n) {
            if (sum>n){
                return 0;
            }
            return 1;
        }

        int one = climbStairsHelp(n,sum+1,count);
        int two = climbStairsHelp(n,sum+2,count);

        return one+two;
    }
}
