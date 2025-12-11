public class Reverse_StringArray {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        ReverseStringArray(s);
    }
    public static void ReverseStringArray(char[] s) {
        int start = 0,end = s.length-1;
        while (start<end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
        printArray(s);
    }
    public static void printArray(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
