class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        if (n == 1) {
            return (double) nums[0];
        }

        double average = Double.NEGATIVE_INFINITY;
        double sum = 0;

        int backward = 0;

        int forward = 0;

        while (forward < n) {
            if (forward - backward < k) {
                sum = sum + nums[forward];
                forward++;
            } else {
                sum = sum - nums[backward] + nums[forward];
                backward++;
                forward++;
            }

            if (forward - backward == k) {
                average = Math.max(average, sum / k);
            }
        }

        return average;

    }
}