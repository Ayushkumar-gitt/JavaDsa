package Accenture;

import java.util.ArrayList;
import java.util.Stack;

public class Day7 {
    public static void main(String[] args) {
//        System.out.println(reverse(120));
        System.out.println(isValid("([)]"));
    }

    public static int reverse(int a) {
        int sum = 0;
        while (a != 0) {
            int rem = a % 10;
            if (sum > Integer.MAX_VALUE / 10 ||
                    (sum == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (sum < Integer.MIN_VALUE / 10 ||
                    (sum == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            sum = sum * 10 + rem;
            a = a / 10;
        }
        return sum;
    }

    public static boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                list.push(c);
            } else {
                if (list.isEmpty()) return false; // If list is empty we dont do peek or pop

                if (c == ')' && list.peek() == '(') list.pop();
                else if (c == ']' && list.peek() == '[') list.pop();
                else if (c == '}' && list.peek() == '{') list.pop();
                else return false; // If closing bracket is found but opening was not found just before that then simply return false , because it will stay all the time in the stack and anyways stack is not going to be empty because of that element
            }
            i++;
        }
        return list.isEmpty();
    }
}
