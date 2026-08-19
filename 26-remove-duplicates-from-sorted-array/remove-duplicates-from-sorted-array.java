class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=1;
        int i=1;
        while(i<nums.length)
        {
            if(nums[ind-1]!=nums[i])
            {
                nums[ind]=nums[i];
                ind++;
            }
            i++;
        }
        return ind;
    }
}