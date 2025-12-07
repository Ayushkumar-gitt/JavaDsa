public class Recursion {
    public static void main(String[] args) {
        // print(1);
        fibonacci(0, 1);
    }
    public static void print(int n) {
        if (n==6) {
            return;
        }
        System.out.println("Number is : " + n);
        print(n+1);
    }
    public static void fibonacci(int first_num,int second_num) { // fibonachi not completed start from here tommorow
        int third_num;
        if (second_num==21) {
            return;
        }
        third_num = first_num + second_num;
        System.out.print(second_num + " ");
        fibonacci(second_num, third_num);
        
    }
}
