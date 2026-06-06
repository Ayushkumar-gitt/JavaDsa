public class Leetcode645 {
    public static void main(String[] args) {
        int arr[] = {2,2};
        int[] ans = findErrorNums(arr);
        for (Integer val : ans) {
            System.out.print(val + " ");
        }
    }
    public static int[] findErrorNums(int[] arr) { //Leetcode 645
        int i = 0; 
        int n = arr.length;
        int[] arrList = new int[2];
        while (i <= n - 1) {
            int correctidx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[i] == arr[correctidx]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correctidx];
                arr[correctidx] = temp;
            }
        }
        // System.out.println(Arrays.toString(arr));
        // int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                arrList[0] = arr[j];
                arrList[1] = j+1;
            }
        }
        return arrList;
    }
}
