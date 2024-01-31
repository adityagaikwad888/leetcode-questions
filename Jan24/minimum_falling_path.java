import java.util.*;

public class minimum_falling_path {

    ///////      Methode 1       /////////


    // public static int minFallingPathSum(int[][] A) {
    //     int m = A.length;
    //     int n = A[0].length;

    //     if (m == 1 || n == 1)
    //         return A[0][0];

    //     int[][] dp = new int[m][n];
    //     for (int[] row : dp) {
    //         Arrays.fill(row, Integer.MAX_VALUE);
    //     }

    //     int ans = Integer.MAX_VALUE;

    //     for (int i = 0; i < A.length; ++i) {
    //         ans = Math.min(ans, minFallingPathSum(A, 0, i, dp));
    //     }

    //     return ans;
    // }

    // private static int minFallingPathSum(int[][] A, int row, int col, int[][] dp) {
    //     int m = A.length;
    //     int n = A[0].length;
    //     if (dp[row][col] != Integer.MAX_VALUE)
    //         return dp[row][col];

    //     if (row == m - 1)
    //         return dp[row][col] = A[row][col];

    //     int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

    //     if (col > 0)
    //         left = minFallingPathSum(A, row + 1, col - 1, dp);

    //     int straight = minFallingPathSum(A, row + 1, col, dp);

    //     if (col < n - 1)
    //         right = minFallingPathSum(A, row + 1, col + 1, dp);

    //     dp[row][col] = Math.min(left, Math.min(straight, right)) + A[row][col];

    //     return dp[row][col];
    // }

    public static int minFallingPathSum(int[][] matrix) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        Map<String,Integer> M = new HashMap<>();
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < columns; i++) {
            answer = Math.min(answer,RF(matrix, 0, i, M, columns, rows));
        }
        return answer;
    }
    private static int RF(int [][] A,int r,int c,Map<String,Integer> M,int columns,int rows){
        if (r == rows) {
            return 0;
        }
        if (c <0 || c>columns-1) {
            return Integer.MAX_VALUE;
        }

        String key = r + "," +c;
        if (M.containsKey(key)) {
            return M.get(key);
        }

        int temp1 = RF(A, r+1, c-1, M, columns, rows);
        int temp2 = RF(A, r+1, c, M, columns, rows);
        int temp3 = RF(A, r+1, c+1, M, columns, rows);

        M.put(key, A[r][c] + Math.min(temp1, Math.min(temp2, temp3)));
        return A[r][c] + Math.min(temp1, Math.min(temp2, temp3));
    }


    public static void main(String[] args) {

    }
}
