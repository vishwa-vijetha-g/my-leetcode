class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        ArrayList<Integer> mins = new ArrayList<>();

        for(int i=0;i<rows;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<cols;j++){
                min = Math.min(min,matrix[i][j]);
            }
            mins.add(min);
        }

        ArrayList<Integer> maxs = new ArrayList<>();

        for(int j=0;j<cols;j++){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<rows;i++){
                max = Math.max(max,matrix[i][j]);
            }
            maxs.add(max);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==mins.get(i) && matrix[i][j]==maxs.get(j)){
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
}