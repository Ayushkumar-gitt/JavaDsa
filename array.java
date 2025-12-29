import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(2);
        // arr.add(45);
        // arr.add(41);
        // arr.add(11);
        // System.out.println(arr);
        int arr[] = {2000,64,21,41,3,1,5};
        int arr2d[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // System.out.println(maximumWealth(arr2d));
        // System.out.println(maxvalue(arr));
        searchin2D(arr2d, 9);
        // System.out.println(findNumbers(arr));

    }
    public static int maxvalue(int[] arr){
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    public static void searchin2D(int arr[][],int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j<arr[i].length;j++){
                if (arr[i][j]==target) {
                    System.out.println(i + "," + j);
                }
            }
            
        }
    }

    public static int findNumbers(int[] nums) {
        int fcount = 0;
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            int elenum = nums[i];
            while (elenum>0) {
                elenum = elenum/10;
                count++;
            }
            if (count%2==0) {
                fcount++;
            }
        }
        return fcount;
    }

    public static int maximumWealth(int[][] accounts) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum+= accounts[i][j];
            }
            if (sum>answer) {
                answer = sum;
            }
        }
        return answer;
    }
}
