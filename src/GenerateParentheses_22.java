/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *For example, given n = 3, a solution set is:
 */
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22{

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0) return res;
        helper(res, "", n, n);
        return res;
    }

    public static void helper(List<String> res, String s, int left, int right) {
        if(left > right) {
            return;
        }
        if(left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if(left > 0) {
            helper(res, s+"(", left - 1, right);
        }
        if(right > 0) {
            helper(res, s+")", left, right - 1);
        }

    }

    public static void main(String[] args) {
        GenerateParentheses_22 test = new GenerateParentheses_22();
        int n = 3;
        List<String> result = test.generateParenthesis(n);
        for(int i = 0; i < result.size(); i++) {
            if(i == result.size()) {
                System.out.print(result.get(i));
            }
            System.out.println(result.get(i));
        }
    }
}
