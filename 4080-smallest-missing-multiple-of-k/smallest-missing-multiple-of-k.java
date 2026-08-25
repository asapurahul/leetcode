class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();

        int max=0;
        for(int i = 0; i < nums.length; i++)
        {
            max=Math.max(max,nums[i]);
            l.add(nums[i]);
        }

        int res = 0;

        for(int i = k; i <= max+ k; i += k)
        {
            if(!l.contains(i))
            {
                res = i;
                break;
            }
        }
        return res;
    }
}