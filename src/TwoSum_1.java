/**
 * Given nums = [2, 7, 11, 15], target = 9,Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
import java.util.HashMap;
public class TwoSum_1 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length >= 2) {
            HashMap<Integer, Integer> map = new HashMap();
            for(int i = 0; i <= numbers.length; i++){
                if(!map.containsKey(target - numbers[i]) && !map.isEmpty()){
                    int[] k = {map.get(target - numbers[i]), i};
                    return k;
                }else{
                    map.put(numbers[i], i);
                }
            }
        }
        int[] k = {0, 1};
        return k;
    }
    public static void main(String[] agrs) {
        TwoSum_1 test = new TwoSum_1();
        int[] numbers = {1, 5, 6, 2, 8};
        int target = 13;
        System.out.println(test.twoSum(numbers, target));
    }
}
