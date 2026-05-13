public class squarejv {
    public static void main(String[] args) {

        long startTime = System.nanoTime(); // start time

        int size = 1_000_000;
        long arr[] = new long[size];
        long newarr[] = new long[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i] * arr[i];
        }

        long endTime = System.nanoTime(); // end time

        double totalTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;

        System.out.println("Total Execution Time (seconds): " + totalTimeInSeconds);
        for (long i : newarr) {
            System.out.println(i);
        }
    }
}
