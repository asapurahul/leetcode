class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int n = nums.size();

        for(int i = 1; i < n; i++) {
            nums.set(i, nums.get(i) + nums.get(i - 1));
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + l - 1; j <= i + r - 1 && j < n; j++) {
                int curr;

                if(i == 0)
                    curr = nums.get(j);
                else
                    curr = nums.get(j) - nums.get(i - 1);

                if(curr > 0)
                    min = Math.min(min, curr);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}