import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <=10; i++) { // table reverse
            System.out.println(num*i);
        }
        System.out.println("-----------");
        for (int i = 10; i >=1; i--) { // table reverse
            System.out.println(num*i);
        }
    }
}
