import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        while (n!=1){
            int sum = 0;
            while (n!=0){
                int val = (n%10)*(n%10);
                n = n/10;
                sum = val + sum;
            }
            n = sum;
            if (map.contains(sum)){
                return false;
            }else{
                map.add(sum);
            }
        }
        return true;
    }
}
