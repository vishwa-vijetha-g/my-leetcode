class neighborSum {
    int[][] grid;
    int n;
    public neighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }
    
    public int adjacentSum(int value) {
        int adjSum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==value){
                    if(i>0){
                        adjSum+=grid[i-1][j];
                    }
                    if(j<n-1){
                        adjSum+=grid[i][j+1];
                    }
                    if(i<n-1){
                        adjSum+=grid[i+1][j];
                    }
                    if(j>0){
                        adjSum+=grid[i][j-1];
                    }
                    break;
                }
            }
        }
        return adjSum;
    }
    
    public int diagonalSum(int value) {
        int diagSum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==value){
                    if(i>0 && j<n-1){
                        diagSum+=grid[i-1][j+1];
                    }
                    if(j<n-1 && i<n-1){
                        diagSum+=grid[i+1][j+1];
                    }
                    if(i<n-1 && j>0){
                        diagSum+=grid[i+1][j-1];
                    }
                    if(j>0 && i>0){
                        diagSum+=grid[i-1][j-1];
                    }
                    break;
                }
            }
        }
        return diagSum;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */