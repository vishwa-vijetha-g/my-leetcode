class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<long[]> list = new ArrayList<>();

        for(long n:nums){
            list.add(new long[]{n,mapping(mapping,String.valueOf(n))});
        }

        Collections.sort(list,(a,b)->{
            return Long.compare(a[1],b[1]);
        });

        int[] ans = new int[nums.length];
        int index = 0;
        for(long[] l:list){
            ans[index] = (int) l[0];
            index++;
        }

        return ans;
    }

    public long mapping(int[] mapping, String num){
        StringBuilder sb = new StringBuilder();
        for(char c:num.toCharArray()){
            sb.append(mapping[c-'0']);
        }
        return Long.parseLong(sb.toString());
    }
}