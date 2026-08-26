package A2Z;

public class Recursion_Basics {
    public static void main(String[] args) {
//        System.out.println(NnumbersSum(10));
//        System.out.println(factorial(5));
        int[] arr = {1,2,3,4,5};
//        reverse(arr,0);
        System.out.println(fib(9));
    }

    public static int NnumbersSum(int N) {
        return NnumbersSumHepler(N,1,0);
    }
    public static int NnumbersSumHepler(int n,int count,int sum){
        if (count>n){
            return sum;
        }
        sum = sum+count;
        return NnumbersSumHepler(n,count+1,sum);
    }

    public static int factorial(int n) {
        if (n==0 || n==1){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void reverse(int[] arr, int n) {
        reverseHelper(arr,0);
    }
    public static void reverseHelper(int[] arr,int count){
        if (count>=arr.length/2){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            return;
        }
        int lastIdx = arr.length-count-1;
        int temp = arr[count];
        arr[count] = arr[lastIdx];
        arr[lastIdx] = temp;

        reverseHelper(arr,count+1);
    }
    public static int fib(int n) {
        if (n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
