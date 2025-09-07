import java.util.Scanner;

public class isprime {
    // Java Program to demonstrate Brute Force Method to check if a number is prime

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=1) {
            System.out.println("Not a prime number");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
}

