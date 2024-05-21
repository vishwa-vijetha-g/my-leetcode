class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:nums2){
            if(hs1.contains(i)){
                ans.add(i);
                hs1.remove(i);
            }
        }

        int[] finalAns = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            finalAns[i] = ans.get(i);
        }

        return finalAns;
    }
}