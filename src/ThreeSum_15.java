/**
 * Given an array S of n integers, are there elements a, b, c
 * in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int j, k, sum;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i <= nums.length - 2; i++){
            j = i+1;
            k = nums.length - 1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> ls = new ArrayList<Integer>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    res.add(ls);
                    j++;
                    k--;
                    while(j < k && nums[k] == nums[k+1]) k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }else if(sum > 0){
                    k--;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }else{
                    j++;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }
            }
            while(i < nums.length - 2 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
