package leetcode020;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.empty()) {
                stack.push(c);
            } else {
                if ((stack.peek() == '(' && ')' == c) || (stack.peek() == '[' && ']' == c) || (stack.peek() == '{' && '}' == c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.empty();
    }


    public boolean isValid2(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                char topChar = stack.empty() ? '&' : stack.pop();

                if (topChar!=map.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
