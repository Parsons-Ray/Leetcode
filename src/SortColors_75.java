/**
 * Given an array with n objects colored red, white or blue,
 * sort them so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        int i = 0;
        while(i <= right) {
            if(nums[i] == 0) {
                swap(nums, i, left);
                left++;
                i++;
            }else if(nums[i] == 2) {
                swap(nums, i, right);
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
