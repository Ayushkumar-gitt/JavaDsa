import java.util.ArrayList;
import java.util.List;

public class Leetcode412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> ansList = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            
            if (i%3 == 0 && i%5 == 0) {
                ansList.add("FizzBuzz");
            }else if (i%3==0) {
                ansList.add("Fizz");
            }else if (i%5==0) {
                ansList.add("Buzz");
            }else{
                ansList.add(Integer.toString(i));
            }
        }
        return ansList;
    }
}
