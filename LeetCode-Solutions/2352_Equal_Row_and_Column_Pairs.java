class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<ArrayList<Integer>,Integer> allRows = new HashMap<>();
        //HashMap<ArrayList<Integer>,Integer> allCols = new HashMap<>();
        int r = grid.length;
        int c = grid[0].length;

        for(int i=0;i<r;i++){
            ArrayList<Integer> currRow = new ArrayList<>();
            for(int j=0;j<r;j++){
                currRow.add(grid[i][j]);
            }
            int freqR = allRows.getOrDefault(currRow,0);
            allRows.put(currRow,freqR+1);

        }

        int count = 0;

        for(int j=0;j<c;j++){
            ArrayList<Integer> currCol = new ArrayList<>();
            for(int i=0;i<r;i++){
                currCol.add(grid[i][j]);
            }
            // int freqC = allCols.getOrDefault(currCol,0);
            // allCols.put(currCol,freqC+1);

            if(allRows.containsKey(currCol)){
                count = count + allRows.get(currCol);
            }


        }


        

        // for(ArrayList<Integer> ro:allRows.keySet()){
        //     if(allCols.containsKey(ro)){
        //         count = count + (allRows.get(ro) * allCols.get(ro));
        //     }
        // }

        return count;

    }

}