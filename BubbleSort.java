import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(){
        boolean swapped;
        int arr[] = {-5,3,0,-4,2};
        for(int i = 0;i<=arr.length-1;i++){
            swapped = false;
            for(int j = 0;j<=arr.length-2-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        bubbleSort();
    }
}
