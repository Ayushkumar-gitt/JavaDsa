import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0;i<=arr.length-1;i++){
            int maxidx = 0;
            for (int j = 0;j<arr.length-i;j++){
                if (arr[j]>arr[maxidx]) { // got max element index
                    maxidx = j;
                }
            }
            int temp = arr[maxidx];
            arr[maxidx] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

            System.out.println(Arrays.toString(arr));
            System.out.println(i+"  complete");
        }
//        System.out.println("Max = "+ maxidx);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,6,5};

        selectionSort(arr);
    }
}
