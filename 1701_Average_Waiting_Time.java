class Solution {
    public double averageWaitingTime(int[][] customers) {
        int len = customers.length;
        double time = 0;
        int prev = 0;
        int currStart = 0;
        int currEnd = 0;
        int waitTime = 0;
        for(int i=0;i<len;i++){
            if(prev <= customers[i][0]){
                currStart = customers[i][0];
            }else{
                time+= prev - customers[i][0];
                currStart = prev;
            }
            waitTime = customers[i][1];
            currEnd = currStart + waitTime;
            time+= waitTime;
            prev = currEnd;
        }
        return time/len;
    }
}