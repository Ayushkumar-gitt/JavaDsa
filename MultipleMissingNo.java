import java.util.ArrayList;
import java.util.Arrays;

public class MultipleMissingNo {
    public static ArrayList<Integer> cyclicSort(int arr[]){ // {1,2}
        int i = 1;
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

        System.out.println(Arrays.toString(arr));
        // int ans = arr.length;
        ArrayList<Integer> ansar = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                // ans = j;
                ansar.add(j);
            }
            
        }
        if (ansar.isEmpty()) {
            ansar.add(arr.length);
        }
        
        if (ansar.get(0)==arr.length) {
            ansar.remove(0);
        }
        return ansar;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};

        System.out.println("Missing element : "+ cyclicSort(arr));
    }
}
