/**
 * Created by apple on 3/9/18.
 */
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length) {
            if(target == matrix[i][j]) {
                return false;
            } else if(target > matrix[i][j]) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }
}
