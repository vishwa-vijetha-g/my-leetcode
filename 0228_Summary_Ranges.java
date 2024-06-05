class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        
        if(nums.length==0){
            return ans;
        }

        StringBuilder sb = new StringBuilder();
        int prev = nums[0];
        int gap = 0;
        sb.append(prev);

        int curr = nums[0];
        
        for(int i=1;i<nums.length;i++){
            curr = nums[i];
            if(curr==prev+1){
                prev = curr;
                gap++;
            }else{
                if(gap>0){
                    sb.append("->");
                    sb.append(prev);
                }
                ans.add(sb.toString());
                prev = curr;
                sb = new StringBuilder();
                sb.append(prev);
                gap = 0;
            }            
        }

        if(gap>0){
            sb.append("->");
            sb.append(prev);
        }
        
        ans.add(sb.toString());

        return ans;
    }
}