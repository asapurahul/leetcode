class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int dp[] = new int[n - k + 1];
        int ind = 0;

        for (int i = 0; i < k; i++) {
            dp[0] += nums[i];
        }

        int i = 1;
        double max = dp[0];

        while (i + k <= n) {
            dp[i] = dp[ind] - nums[i - 1] + nums[i + k - 1];

            max = Math.max(dp[i], max);

            ind++;
            i++;
        }

        max = max / k;

        return max;
    }
}