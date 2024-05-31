class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> s = new Stack<>();
        int iLen = intervals.length;
        Arrays.sort(intervals,(a,b)->{ return a[0]-b[0]; });
        s.push(intervals[0]);
        
        for(int i=1;i<iLen;i++){
            int[] curr = s.pop();
            if(curr[1]>=intervals[i][0]){
                curr[0] = (int) Math.min(curr[0],intervals[i][0]);
                curr[1] = (int) Math.max(curr[1],intervals[i][1]);
                s.push(curr);
            }else{
                s.push(curr);
                s.push(intervals[i]);
            }
        }

        int[][] ans = new int[s.size()][2];
        int aIndex = 0;
        for(int[] i:s){
            ans[aIndex] = i;
            aIndex++;
        }
        return ans;
    }
}