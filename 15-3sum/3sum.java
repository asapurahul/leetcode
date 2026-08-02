
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            int l = i + 1;
            int h = nums.length - 1;

            while(l < h)
            {
                if(nums[i] + nums[l] + nums[h] == 0)
                {
                    res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                }
                else if(nums[i] + nums[l] + nums[h] > 0)
                {
                    h--;
                }
                else
                    l++;
            }
        }
        return new ArrayList<>(res);
    }
}

