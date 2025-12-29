import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        // max();
        min();
    }
    public static void max(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a>b&&a>c) {
            System.out.println("A is greater");
        }
        else if (b>c&&b>a) {
            System.out.println("B is greater");
        }else{
            System.out.println("C is greater");
        }

    }
    public static void min(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a<b&&a<c) {
            System.out.println("A is Smaller");
        }
        else if (b<c&&b<a) {
            System.out.println("B is smaller");
        }else{
            System.out.println("C is smaller");
        }

    }
}
