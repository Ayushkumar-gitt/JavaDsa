public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int ar2[] = new int[arr.length];
        // int count = arr.length - 1;
        // for (int i = 0; i <= arr.length - 1; i++) {
        //     ar2[i] = arr[count];
        //     count--;
        // }
        // for (int i = 0; i <= ar2.length - 1; i++) {
        //     System.out.print(ar2[i] + " ");
        // }

        // Now Reversing an array without using another array to save space complexity
        System.out.println("Before Reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Reverse");
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
