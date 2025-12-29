public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while (start<end) {
            int sum = numbers[start]+numbers[end];
            if (sum==target) {
                return new int[]{start+1,end+1};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4};
        int target = 6;
        int arr2[] = twoSum(arr, target);


        for(int i = 0;i<=arr2.length-1;i++){
            System.out.println(arr2[i]);
        }
    }
}
