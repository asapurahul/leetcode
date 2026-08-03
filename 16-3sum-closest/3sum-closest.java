class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {
            for (int l = i + 1; l < nums.length; l++) {
                for (int r = l + 1; r < nums.length; r++) {
                    int sum = nums[i] + nums[l] + nums[r];

                    if (Math.abs(target - sum) < Math.abs(target - res))
                        res = sum;
                }
            }
        }

        return res;
    }
}