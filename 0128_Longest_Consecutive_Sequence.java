class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }

        int max = 0;

        for(int n:nums){
            if(hs.contains(n-1))
                continue;
            int m = n + 1;
            while(hs.contains(m))
                m = m + 1;
            max = Math.max(max,m-n);
        }

        return max;
    }
}