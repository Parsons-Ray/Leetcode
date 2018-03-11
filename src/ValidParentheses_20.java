/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.The brackets must close in the correct
 * order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

import java.util.Stack;
public class ValidParentheses_20 {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0) return true;
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else {
                if (st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses_20 test = new ValidParentheses_20();
        String s = "([])";
        System.out.println(test.isValid(s));
    }
}
