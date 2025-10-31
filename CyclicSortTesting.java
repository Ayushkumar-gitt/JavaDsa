public class CyclicSortTesting {
    public static int cyclicSort(int arr[]){
        int i = 0;
        while (i <=arr.length-1){
            int index = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else {
                i++;
            }
        }
        
        int ans = arr.length;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                ans = j;
                return ans;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,8,1};

        System.out.println("Missing element : "+ cyclicSort(arr));
    }
}
