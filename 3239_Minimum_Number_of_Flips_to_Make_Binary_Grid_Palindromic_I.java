class Solution {
    public int minFlips(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        if(r==1 || c==1) return 0;

        int rowSwaps = 0;
        for(int[] row:grid){
            //System.out.println(Arrays.toString(row));
            rowSwaps += palindromeDiff(row);
        }

        int colSwaps = 0;
        for(int j=0;j<c;j++){
            int[] col = new int[r];
            for(int i=0;i<r;i++){
                col[i] = grid[i][j];
            }
            //System.out.println(Arrays.toString(col));
            colSwaps += palindromeDiff(col);
        }

        //System.out.println(rowSwaps + " " + colSwaps);

        return Math.min(rowSwaps,colSwaps);
    }


    public int palindromeDiff(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int diff = 0;

        while(start<end){
            if(arr[start]!=arr[end]){
                diff++;
            }
            start++;
            end--;
        }

        return diff;
    }


}