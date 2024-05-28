class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> add1 = new ArrayList<>();
        add1.add(1);

        ans.add(add1);

        for (int i = 1; i < numRows; i++) {

            List<Integer> prev = ans.get(ans.size() - 1);

            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for (int j = 1; j < prev.size(); j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1);

            ans.add(curr);
        }

        return ans;
    }
}