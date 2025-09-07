import java.util.Scanner;

public class patterns1 {
    public static void main(String[] args) {
        // solidRectangle();
        // hollowRectangle();
        // halfPyramid();
        // halfPyramidReverse();
        // halfPyramidReverse180();
        // halfPyramidwithnumbersrev();
        // floydsTriangle();
        // triangle01();
        // triangle0_1();
        // rhombus();
        // numberPyramid();
        // palindromicNumberPyramid();
        // butterfly_a();
        // lakshayQues();
        // diamond();
        // crossbox();
        anonNum();


    }

    public static void solidRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines you want ");
        int n = sc.nextInt();
        System.out.println("Enter number of stars in one line ");
        int star_in_one_line = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= star_in_one_line; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle() {
        int n = 5;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidReverse() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void halfPyramidReverse180() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void halfPyramidwithnumbers() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void halfPyramidwithnumbersrev() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle() {
        int count = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void triangle01() { // Not perfect method
        boolean a = true;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (a == true) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                // System.out.println(a);
                a = !a;

            }
            System.out.println();
        }

    }

    public static void triangle0_1() { // Right Solution
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void rhombus() {
        int n = 5;
        int space = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(' ');
            }
            space--;

            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void numberPyramid() {
        int n = 5;
        int space = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(' ');
            }
            space--;
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicNumberPyramid(){
        int n = 5;
        int space = 4;
        int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            // for(int j = 1;j<=i;j++){
            //     System.out.print(num);
            // }
            for(int j = num;j>=1;j--){
                System.out.print(j);
            }
            num++;
            for(int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();


        }
    }

    public static void butterfly(){
        int n = 5; int space = 8; int s = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            for(int j = space;j>=1;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            space = space-2;
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 0;j<s;j++){
                System.out.print(" ");
            }
            s = s+2;
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            // System.out.print("*");
            System.out.println();
        }
    }

    public static void lakshayQues(){
        int n = 7;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=5;j++){
                if (i==1|| i==n|| i ==4) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly_a(){
        int n = 4; int space = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            int spacee = 2* (n-i);
            for(int j = 1;j<=spacee;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            space = space-2;
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            int spacee = 2* (n-i);
            for(int j = 1;j<=spacee;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            space = space-2;
            System.out.println();
        }
    }    

    public static void diamond(){
        int a = 4;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=a-i;j++){
                System.out.print(" ");
            }
            
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void crossbox(){
        int n = 7;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if (i==1||i==n||j==1||j==n||i==j||i+j==n+1) {
                    System.out.print("*");
                
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
    }

    public static void anonNum(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            int count = i;
            for(int j = 1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
