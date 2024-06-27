class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        int ones = 0;
        int twos = 0;
        int total1 = nums.length;

        for(Integer v:hm.values()){
            if(v>2)
                return false;
            else if(v==2)
                twos++;
            else if(v==1)
                ones++;
        }

        int total2 = (twos*2) + ones;

        return total1 == total2;
    }
}