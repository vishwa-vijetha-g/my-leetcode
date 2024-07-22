class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();

        int n = names.length;

        for(int i=0;i<n;i++){
            hm.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        String[] ans = new String[n];
        int k = 0;

        for(int j=n-1;j>=0;j--){
            ans[k] = hm.get(heights[j]);
            k++;
        }

        return ans;

    }
}