import java.util.Arrays;

public class CyclicSortTesting {
    public static void cyclicSort(){
        int arr[] = {4,0,2,1};
        int i = 0;
        while (i <=arr.length-1){
            int idx = arr[i];
            if (arr[i]<arr.length) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
//            if (arr[i]<arr.length){
//                i++;
//            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        cyclicSort();
    }
}
