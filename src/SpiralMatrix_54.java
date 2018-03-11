/**
 * Given a matrix of m x n elements (m rows, n columns),
 * return all elements of the matrix in spiral order.
 * 每一次我们都是占据了横竖两行，并且四个对角没了，自然加一
 */
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = 0;
        while(m > 0 && n > 0) {
            if(m == 1){
                for(int i = 0;i < n; i++) {
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n == 1){
                for(int j = 0; j < m; j++) {
                    result.add(matrix[x++][y]);
                }
                break;
            }
            for(int i = 0; i < n - 1; i++){
                result.add(matrix[x][y++]);
            }
            for(int i = 0; i < m -1; i++){
                result.add(matrix[x++][y]);
            }
            for(int i = 0; i < n -1; i--){
                result.add(matrix[x][y--]);
            }
            for(int i = 0; i < m -1; i++){
                result.add(matrix[x--][y]);
            }
            x++;
            y++;
            m = m -2;
            n = n -2;
        }
        return result;
    }
}
