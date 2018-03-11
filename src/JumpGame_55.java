/**
 * Given an array of non-negative integers, you are initially positioned
 * at the first index of the array.Each element in the array represents
 * your maximum jump length at thatposition.Determine if you are able
 * to reach the last index.
 */
public class JumpGame_55 {
    public boolean canJump(int[] A) {
        if(A == null &&  A.length == 0) return true;
        int n = A.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(A[i] == 0) return false;
            if(A[i] + i > max) {
                max = A[i] + i;
            }
            if(max > n -1) return true;
        }
        return false;
    }
}
