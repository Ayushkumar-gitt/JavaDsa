public class RotatedArray {
    public static int rotatedSearch(int arr[],int target,int start,int end){
        int mid = (start+end)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if (arr[start]<=arr[mid]) {    
        if (arr[start]<=target&&target<=arr[mid]) {
            return rotatedSearch(arr, target, start, mid-1);
        }
        else{
            return rotatedSearch(arr, target, mid+1, end);
        }
    } else{
        if (arr[mid]<=target && target<=arr[end]) {
            return rotatedSearch(arr, target, mid+1, end);
        }else{
            return rotatedSearch(arr, target, start, mid-1);
        }
    }

}
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int start = 0;
        int end = arr.length-1;
        System.out.println(rotatedSearch(arr, target, start, end));
    }
    
}
