public class RecursionPatten {
    public static void main(String[] args) {
        
    }
    public static void selectionSortRec(int[] arr,int i,int largest){
        
        // selectionSortRecHelper(arr, i+1, largest,);
    }
    public static void selectionSortRecHelper(int[] arr,int i,int largest,int start,int end){
        if (i==arr.length-1) {
            return;
        }
        if (arr[i]>largest) {
            largest = arr[i];
        }
    }
}