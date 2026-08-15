class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum[]=new int[n];
        leftsum[0]=0;
        int rightsum[]=new int[n];
        rightsum[n-1]=0;
        int res[]=new int[n];
        for(int i=1;i<n;i++)
        {
            leftsum[i]=leftsum[i-1]+nums[i-1];
            rightsum[n-i-1]=rightsum[n-i]+nums[n-i];
        }
        for(int i=0;i<n;i++)
        {
            res[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return res;
    }
}