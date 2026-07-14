public class SortedorNotArray {
    public static void main() {
        int arr[] = {2,4,11,11,17};
        sortedornot(arr,0);
    }
    public static void sortedornot(int[] arr,int i){
        if (arr.length == 0 || i==arr.length-1) {
            System.out.println("Array is sorted");
            return;
        }
        if (arr[i+1]<arr[i]){
            System.out.println("Array is not sorted");
            return;
        }
        sortedornot(arr,i+1);
    }
}
