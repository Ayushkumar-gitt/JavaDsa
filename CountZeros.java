public class CountZeros {
    public static void main(String[] args) {
        int num = 1011000;
        System.out.println(countZeros(0, num));
    }

    public static int countZeros(int count, int num) {
        if (num <= 0) {
            return count;
        }
        if (num % 10 == 0) {
            return countZeros(count + 1, num / 10);
        } else {
            return countZeros(count, num / 10);
        }

    }
}
