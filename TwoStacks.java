import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoStacks {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(4, 2, 4, 6, 1));
        List<Integer> b = new ArrayList<>(List.of(2, 1, 8, 5));
        System.out.println(twoStacks(10, a, b));
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return twoStacksHelper(maxSum, a, b, 0,0);
    }

    public static int twoStacksHelper(int maxSum, List<Integer> a, List<Integer> b,int sum, int count) {
        if (a.isEmpty()) return count;
        if (b.isEmpty()) return count;
        if (sum >= maxSum) return count;

        sum += a.get(0);
        int ans1 = twoStacksHelper(maxSum, a,b,sum,count+1);
        sum += b.get(0);
        int ans2 = twoStacksHelper(maxSum, a, b, sum,count+1);

        return Math.max(ans1,ans2);
    }
}
