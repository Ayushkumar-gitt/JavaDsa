import java.util.Arrays;

public class BasicOpsArray {
    public static void main(String[] args) {
        // Inserting element at desired index 
        int[] arr = { 10, 20, 30, 40, 0 };
        int pos = 2; 
        int val = 99;

        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1]; // Basically we are shiftting elements to right cause one element is empty at last , so that we can use that space by shifting to right and get some space at the required index to insert element.. 
            // We can't do this if array is already full 
        }
        arr[pos] = val;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Deleting desired element
        int[] arr1 = {10, 20, 30, 40, 50};
        int indexToDelete = 2; // delete element at index 2 (value 30)

        for (int i = indexToDelete; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];  // shift left
        }

        
        for (int i = 0; i < arr1.length - 1; i++) { // Arr1.length-1 ignores the last element cause it gets duplicate when removing an element from array
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println("\n---------------");

        // Q2 JAVA LAB

        int[] arr2 = new int[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1; 
        }

        System.out.println("Original Array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 2; i < arr2.length - 1; i++) {
            arr2[i] = arr2[i + 1]; 
        }
        arr2[arr2.length - 1] = 0; // last becomes 0 (or unused)

        System.out.println("After removing 3rd element:");
        for (int i = 0;i<arr2.length-1;i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        arr2[3] = 99;

        System.out.println("After updating 4th element:");
        for (int i = 0;i<arr2.length-1;i++){
            System.out.print(arr2[i] + " ");
        }
        Arrays.sort(arr2);
        System.out.println();
        for (int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

        int ar3[] = new int[10];
        int count = arr2.length-1;
        for (int i = 0; i < arr2.length; i++) {
            ar3[i] = arr2[count];
            count--;
        }
        System.out.println("\nArray Reverse Copy - ");
        for (int i = 0;i<ar3.length-1;i++){
            System.out.print(ar3[i] + " ");
        }
        
    }
}
