/**
 * Given nums = [1,1,2],
 *Your function should return length = 2, w
 *ith the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return (j+1);
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray_26 test = new RemoveDuplicatesfromSortedArray_26();
        int[] nums = {1, 1, 3, 3, 4, 5, 6, 7, 8};
        System.out.println(test.removeDuplicates(nums));
    }

}
