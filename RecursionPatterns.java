public class RecursionPatterns {
    public static void main(String[] args) {
        int arr[] = {4,3,2,8,1};
        selectionSort(arr, 0, 0,arr.length-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int arr[],int largestElement,int index,int endindex) {
        if (endindex == 0) {
            return;
        }
        if (index <= endindex) {
            if (arr[index] > arr[largestElement]) {
                largestElement = index;
            }
            selectionSort(arr, largestElement, index + 1, endindex);
        } else{
            int temp = arr[largestElement];
            arr[largestElement] = arr[endindex];
            arr[endindex] = temp;
            selectionSort(arr, 0, 0, endindex - 1);
        }
    }
}
