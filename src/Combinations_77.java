/**
 * Given two integers n and k, return all possible combinations
 * of k numbers out of 1 ... n.
 */
import com.sun.tools.jdi.IntegerValueImpl;

import java.util.List;
import java.util.ArrayList;
public class Combinations_77 {
    public static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }
    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k == 0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i = start; i <= n; i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size() - 1);
        }
    }
}
