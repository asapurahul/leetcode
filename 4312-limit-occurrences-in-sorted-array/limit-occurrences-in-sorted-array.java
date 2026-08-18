class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int write = 0;
        for (int i = 0; i < nums.length; i++) {
            if (write < k || nums[write - k] != nums[i]) {
                nums[write++] = nums[i];
            }
        }
        return Arrays.copyOf(nums, write);
    }
}