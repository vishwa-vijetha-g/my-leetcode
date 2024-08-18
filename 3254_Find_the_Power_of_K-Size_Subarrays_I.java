class Solution {
    public int[] resultsArray(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length-k+1;i++){
            int count = 1;
            for(int j=i;j<i+k-1;j++){
                if(nums[j+1]-nums[j]==1){
                    count++;
                }else{
                    ans.add(-1);
                    break;
                }
                
            }
            if(count==k){
                ans.add(nums[i+k-1]);
            }
            
        }
        int[] ans2 = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans2[i] = ans.get(i);
        }
        return ans2;
    }
}