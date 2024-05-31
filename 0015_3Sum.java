class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<ArrayList<Integer>> ans = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            int j = i + 1;
            int k = n-1;
            while(j<k){
                ArrayList<Integer> curr = new ArrayList<>();
                int triplet = nums[i] + nums[j] + nums[k];
                if(triplet==0){
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    ans.add(curr);
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(triplet<0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        List<List<Integer>> finalAns = new ArrayList<>();
        finalAns.addAll(ans);

        return finalAns;
    }
}