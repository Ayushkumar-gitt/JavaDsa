import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int maxidx = 0;
            for (int j = 0; j <= arr.length - i-1; j++) { // arr.length -i because jitne iterations hogye h utne elements
                                                       // sort hogye h last se , so unme largest find krne ki jarurat
                                                       // nhi h , issi liye hm jitne complete iterations hogye utna
                                                       // minus kr de rhe h

                if (arr[j] > arr[maxidx]) { // got max element index
                    maxidx = j;
                }
            }
            int temp = arr[maxidx];               // Swapping
            arr[maxidx] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

            System.out.println(Arrays.toString(arr)); 
            System.out.println(i + "  complete");
        }
        // System.out.println("Max = "+ maxidx);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 6, 5 };

        selectionSort(arr);
    }
}
