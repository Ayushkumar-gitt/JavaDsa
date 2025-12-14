public class NumberSystem {
    public static void main(String[] args) {
        // System.out.println(isOdd(68));
        int arr[] = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(isUnique(arr));
    }
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    public static int isUnique(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }
}