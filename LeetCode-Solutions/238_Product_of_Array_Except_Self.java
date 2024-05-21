class Solution {
    public int[] productExceptSelf(int[] nums) {

        int totalProduct = 1;
        int zeroes = 0;
        int n = nums.length;
        int[] ans = new int[n];

        for (int i : nums) {
            if (i == 0) {
                zeroes++;
            } else {
                totalProduct *= i;
            }
        }

        if (zeroes == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    ans[i] = totalProduct;
                }
            }
        } else if(zeroes<1) {
            for (int i = 0; i < n; i++) {
                ans[i] = totalProduct / nums[i];
            }
        }

        return ans;

        //another way is to to multiply prefix product and suffix product(both skips current element) - check soln
    }
}