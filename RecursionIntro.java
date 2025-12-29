public class RecursionIntro {
    public static void main(String[] args) {
        // print(1);
        // fibonacci(0, 1);
        System.out.println(fibo(4));
        // int n =8;
        // power(n);
    }
    public static void print(int n) {
        if (n==6) {
            return;
        }
        System.out.println("Number is : " + n);
        print(n+1);
    }
    // public static void fibonacci(int first_num,int second_num) { // fibonachi not completed start from here tommorow
    //     int third_num;
    //     if (second_num>=2155) {
    //         return;
    //     }
    //     third_num = first_num + second_num;
    //     System.out.print(second_num + " ");
    //     fibonacci(second_num, third_num);
        
    // }
    public static int fibo(int n) {
        if (n<2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void power(int n) {
        Double ans = Math.sqrt(n); // Think again , May be thinking with wrong approach.
        Boolean val = ans%1==0;
        System.out.println(val);
    }
}
