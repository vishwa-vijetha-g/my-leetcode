class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            if(n>0)
                hs.add(n);
        }
        int i=1;
        while(true){
            if(!hs.contains(i)) return i;
            i++;
        }
    }
}