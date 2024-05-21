class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0] - b[0];
        });

        int iLength = intervals.length;
        int prevEnd = intervals[0][1];
        int ans = 0;
        for(int i=1; i<iLength; i++){
            if(intervals[i][0]>=prevEnd){
                prevEnd = intervals[i][1];
            }else{
                ans++;
                prevEnd = (int) Math.min(prevEnd, intervals[i][1]);
            }
        }

        return ans;
    }
}