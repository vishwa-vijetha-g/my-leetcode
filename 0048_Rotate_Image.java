class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        
        //System.out.println(Arrays.deepToString(matrix));
        
        for(int i=0;i<n;i++){
            reverseArr(matrix[i],n);
        }

        
    }

    public void reverseArr(int[] row, int size){
        int start = 0;
        int end = size - 1;
        while(start < end){
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    
}