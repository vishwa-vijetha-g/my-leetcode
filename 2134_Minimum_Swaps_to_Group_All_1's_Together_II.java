class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int ones = 0;

        for (int i : nums) {
            if (i == 1)
                ones++;
        }

        int left = 0;
        int right = 0;
        int zeroes = 0;
        int swaps = Integer.MAX_VALUE;

        while (right < ones) {
            if (nums[right] == 0)
                zeroes++;
            right++;
        }
        swaps = Math.min(swaps, zeroes);

        int l = left;
        int r = right;

        while (right < 2 * n) {
            if (left >= n)
                l = left % n;
            else
                l = left;

            if (right >= n)
                r = right % n;
            else
                r = right;

            if (nums[l] == 0)
                zeroes--;
            if (nums[r] == 0)
                zeroes++;

            left++;
            right++;

            swaps = Math.min(swaps, zeroes);
        }

        return swaps;
    }
}