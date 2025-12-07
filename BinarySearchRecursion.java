public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(BS_Recursion(arr, 2, 0, arr.length-1));
    }
    public static int BS_Recursion(int[] arr,int target,int start,int end) {
        if (start>end) {
            return -1;
        }
        int mid = (start+end)/2;
        
        if (target<arr[mid]) {
            return BS_Recursion(arr, target, start, mid-1);
        }
        if (target>arr[mid]) {
            return BS_Recursion(arr, target, mid+1, end);
        }
        if (arr[mid]==target) {
            return mid;
        }  
        return -1;
    }
}
