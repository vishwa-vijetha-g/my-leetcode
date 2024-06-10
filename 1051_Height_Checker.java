class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int diff = 0;

        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                diff++;
            }
        }

        return diff;
    }
}