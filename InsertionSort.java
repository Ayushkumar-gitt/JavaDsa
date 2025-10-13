
public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i = 0; i <=arr.length-2; i++) {
            for (int j = i+1; j>0; j--) {
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else{
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]  = {5, 12, 7, 22, 18, 9, 30, 14, 6, 25, 11, 8, 17, 4, 21, 13, 3, 10, 2, 19};

        insertionSort(arr);
    }
}
