class Solution {
    public int countCompleteDayPairs(int[] hours) {
        
        int h = hours.length;

        int ans = 0;

        for(int i=0;i<h-1;i++){
            for(int j=i+1;j<h;j++){
                if((hours[i]+hours[j])%24==0)
                    ans++;
            }
        }
        
        return ans;
        
    }
}