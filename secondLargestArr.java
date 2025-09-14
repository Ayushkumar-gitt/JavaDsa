public class secondLargestArr {
    public static void main(String[] args) {
        int arr[] = {2,47,63,5,44,1};
        int firstLargest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>firstLargest) {
            secondLargest = firstLargest;;
            firstLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
