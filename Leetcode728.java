import java.util.ArrayList;
import java.util.List;

public class Leetcode728 {
    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }   
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ;i<=right;i++){
            boolean selfDivisibleno = true;
            while (left!=0) {
                String val = String.valueOf(left);
                if (val.contains("0")) {
                    break;
                }
                int ileft = left / 10;
                if (i%ileft!=0) {
                    selfDivisibleno = false;
                }
                ileft = left %10;
                if (selfDivisibleno == true) {
                    list.add(left);
                }
            }
        }
        return list;
    }
}

