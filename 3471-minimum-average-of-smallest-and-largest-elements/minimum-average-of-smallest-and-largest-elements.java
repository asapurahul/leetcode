class Solution {

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int minSum = Integer.MAX_VALUE;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            minSum = Math.min(minSum, nums[left] + nums[right]);
            left++;
            right--;
        }

        return minSum / 2.0;
    }

}