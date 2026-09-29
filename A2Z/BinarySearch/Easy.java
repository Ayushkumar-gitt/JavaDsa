package A2Z.BinarySearch;

public class Easy {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,2));
    }
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end =arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end =arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
