/**
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class SearchforaRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, 1};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                targetRange[0] = i;
                break;
            }
        }
        if(targetRange[0] == -1) {
            return targetRange;
        }
        for(int j = nums.length - 1; j >= 0; j--) {
            if(nums[j] == target) {
                targetRange[1] = j;
                break;
            }
        }
        return targetRange;
    }
}
