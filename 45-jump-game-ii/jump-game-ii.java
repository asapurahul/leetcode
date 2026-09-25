class Solution {

    public int jump(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int count = 0;

        return helper(nums, left, right, n, count);
    }

    public int helper(int[] nums, int left, int right, int n, int count) {

        if (right >= n - 1) {
            return count;
        }

        int max = 0;
        int bestIndex = left;

        for (int i = left; i <= right; i++) {

            if (i + nums[i] > max) {
                max = i + nums[i];
                bestIndex = i;
            }
        }

        return helper(nums, bestIndex, max, n, count + 1);
    }
}