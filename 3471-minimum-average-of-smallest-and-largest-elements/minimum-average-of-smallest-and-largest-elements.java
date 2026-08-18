class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        double min=Integer.MAX_VALUE;
        for(int i=0;i<n/2;i++)
        {
            double curr=(double)(nums[i]+nums[n-i-1])/2;
            if(curr<min)
                min=curr;
        }
        return min;
    }
}