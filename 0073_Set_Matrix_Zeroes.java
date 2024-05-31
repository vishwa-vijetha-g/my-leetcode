class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for(int r:zeroRows){
            setRowZeroes(matrix,r,n);
        }

        for(int c:zeroCols){
            setColZeroes(matrix,m,c);
        }

    }

    public void setRowZeroes(int[][] matrix, int row, int n){
        for(int j=0;j<n;j++){
            matrix[row][j] = 0;
        }
    }

    public void setColZeroes(int[][] matrix, int m, int col){
        for(int i=0;i<m;i++){
            matrix[i][col] = 0;
        }
    }
}