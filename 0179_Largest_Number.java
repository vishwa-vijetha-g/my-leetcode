class Solution {
    public String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for(int i=0;i<nums.length;i++)
            numsStr[i] = String.valueOf(nums[i]);

        Arrays.sort(numsStr,(a,b)->{
            return (b+a).compareTo(a+b);
        });

        return numsStr[0].equals("0") ? "0" : String.join("",numsStr);
    }
}