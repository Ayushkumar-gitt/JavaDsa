public class SuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        shuffle(arr, 3);
        
    }
    public static void shuffle(int nums[],int n){
        for(int i = 0;i<=nums.length-1;i++){
            swap(nums, i, i+n);
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
