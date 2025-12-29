import java.util.ArrayList;

public class RunningSumar {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arrsum = 0;
        int[] sumar = new int[5];
        ArrayList ar = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            arrsum += arr[i];
            ar.add(arrsum);
        }
        
        System.out.println(ar);
    }
}
