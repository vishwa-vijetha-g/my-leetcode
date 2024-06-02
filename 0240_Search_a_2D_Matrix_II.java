class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rs = 0;
        int ce = matrix[0].length-1;

        while(rs<matrix.length && ce>=0){
            if(matrix[rs][ce]==target){
                return true;
            }else if(matrix[rs][ce]<target){
                rs++;
            }else{
                ce--;
            }
        }

        return false;
    }
}