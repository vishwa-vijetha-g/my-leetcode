class Solution {
    public int minimumArea(int[][] grid) {
        
        //number of rows
        int r = grid.length;
        
        //number of columns
        int c = grid[0].length;
        
        //initialize a top pointer to the extreme bottom
        int top = r;
        
        //initialize a bottom pointer to the extreme top
        int bottom = -1;
        
        //initialize a left pointer to the extreme right
        int left = c;
        
        //initialize a right pointer to the extreme left
        int right = -1;
        
        //loop over all the elements in the matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                //when 1 is encountered in the matrix
                //keep the four pointers as close as possible to 1
                if(grid[i][j] == 1){

                    //find the closest top value using min function
                    top = Math.min(top,i);

                    //find the closest bottom value using max function
                    bottom = Math.max(bottom,i);

                    //find the closest left value using min function
                    left = Math.min(left,j);

                    //find the closest right value using max function
                    right = Math.max(right,j);
                }
            }
        }
        
        //length = right - left + 1, breadth = bottom - top + 1, area = length * breadth

        return (bottom-top+1)*(right-left+1);
    }
}
