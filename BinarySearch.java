public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,17,18};
        char charr[] = {'c','f','s','y'};
        char chtarget = 'h';
        int target = 5;
        // System.out.println(binarySearch(arr, target));

        // int arrn[] = new int[2];         // SearchRangeQuestion
        // arrn = searchRange(arr, target);
        // for (int i = 0; i < arrn.length; i++) {
        //     System.out.print(arrn[i]);
        // }

        // System.out.println(ceilingofaNum(arr, target));
        // System.out.println(floorofaNum(arr, target));
        // System.out.println(smallestGreaterLetter744(charr, chtarget));

        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]) {
            int newstart = end+1;
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return binarySearchinfi(arr, target, start, end);
    }
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        arr[0] = search(nums, target, true);
        if (arr[0]!=-1) {
            arr[1] = search(nums, target, false);
        }
        return arr;

    }
    static int search(int[] nums,int target ,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if (target<nums[mid]) {
                end = mid-1;
            }else if (target>nums[mid]) {
                start = mid+1;
            }else{
                ans = mid;
                if (findStartIndex) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            
        }
        return ans;
    }
    public static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (target<arr[mid]) {
                end = mid-1;
            }else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
    public static int binarySearchinfi(int arr[],int target,int start,int end){
        while (start<=end) {
            int mid = (start+end)/2;
            if (target<arr[mid]) {
                end = mid-1;
            }else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
    public static int ceilingofaNum(int arr[],int target){
        if (target>arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1; 
        while (start<=end) {
            int mid = (start+end)/2;
            if (target<arr[mid]) {
                end = mid-1;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return arr[start];
    }
    public static int floorofaNum(int arr[],int target){
        // if (target<arr[0]) {
        //     return -1;
        // }
        int start = 0;
        int end = arr.length-1; 
        while (start<=end) {
            int mid = (start+end)/2;
            if (target<arr[mid]) {
                end = mid-1;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return arr[end]; // we can do (start+end)/2 also on the place of end , because end and middle are currently on same place but its good to use end as its told in tutorial.. 
    }

    public static char smallestGreaterLetter744(char letters[],char target){
        int start = 0;
        int end = letters.length-1;  
        while (start<=end) {
            int mid = (start+end)/2;
            if (target<letters[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            
        }
        return letters[start%letters.length];
    }
}
