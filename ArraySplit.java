public class ArraySplit {
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,4,3,2,3,3};
        int mid = (arr.length -1)/2;
        int firsthalf = 0;
        int secondhalf = 0;
        for (int i = 0; i < mid; i++) {
            firsthalf+=arr[i];
        }
        for (int i = mid; i <arr.length; i++) {
            secondhalf+=arr[i];
        }
        System.out.println("FirstHalf: "+firsthalf);
        System.out.println("SecondHalf: "+secondhalf);
        if (firsthalf==secondhalf) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
