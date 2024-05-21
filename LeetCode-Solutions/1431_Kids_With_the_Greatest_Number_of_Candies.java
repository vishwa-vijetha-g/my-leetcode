class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        int n = candies.length;

        ArrayList<Boolean> soln = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(candies[i] + extraCandies >= maxCandies) {
                soln.add(true);
            }else{
                soln.add(false);
            }
        }

        return soln;

    }
}