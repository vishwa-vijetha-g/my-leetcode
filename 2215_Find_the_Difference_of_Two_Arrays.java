class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<>();

        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();

        for(int i:nums1){
            nums1Set.add(i);
        }

        for(int i:nums2){
            nums2Set.add(i);
        }

        ArrayList<Integer> nums1Array = new ArrayList<>();
        ArrayList<Integer> nums2Array = new ArrayList<>();

        for(int i:nums1Set){
            if(!nums2Set.contains(i)){
                nums1Array.add(i);
            }
        }

        for(int i:nums2Set){
            if(!nums1Set.contains(i)){
                nums2Array.add(i);
            }
        }

        ans.add(nums1Array);
        ans.add(nums2Array);

        return ans;






    }
}