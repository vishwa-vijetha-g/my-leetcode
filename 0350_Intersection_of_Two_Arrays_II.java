class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int num:nums1){
            hm1.put(num, hm1.getOrDefault(num,0) + 1);
        }

        ArrayList<Integer> ansArr = new ArrayList<>();
        int freq;
        for(int num:nums2){
            if(hm1.containsKey(num)){
                ansArr.add(num);
                freq = hm1.get(num) - 1;
                if(freq==0){
                    hm1.remove(num);
                }else{
                    hm1.put(num,freq);
                }
            }
        }

        int[] ans = new int[ansArr.size()];
        int ansIndex = 0;
        for(int a:ansArr){
            ans[ansIndex] = a;
            ansIndex++;
        }
        return ans;
    }
}