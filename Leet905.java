import java.util.Arrays;

public class Leet905 {
    public static void main(String[] args) {
        int arr[] = {1,5,2,8,4};
        sortArrayByParity(arr);
    }

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right) {
            if (nums[left]%2!=0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }else{
                left++;
            }
        }
        return nums;
    }
}
