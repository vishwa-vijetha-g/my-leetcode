class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n - 1][n - 1];
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = getLessOrEqual(matrix, mid);
            if (count < k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public int getLessOrEqual(int[][] matrix, int m) {
        int count = 0;
        int n = matrix.length;
        int row = 0, col = n - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] > m) {
                col--;
            } else {
                count += (col + 1);
                row++;
            }
        }
        return count;
    }
}