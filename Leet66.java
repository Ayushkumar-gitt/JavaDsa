import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Leet66 {
    public static void main(String[] args) {
        int arr[] = { 9, 9, 9 };
        Scanner sc = new Scanner(System.in);
        // arr[2] = sc.nextInt();
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int start = 0;
        int end = digits.length - 1;

        while (digits[end] == 9) {
            digits[end] = 0;
            if (start == end) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                return newArr;
            } else {
                end--;
            }
        }
        if (digits[end] != 9) {
            digits[end] = digits[end] + 1;
        }
        return digits;
    }
}
