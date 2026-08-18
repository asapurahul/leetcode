class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        double min=Integer.MAX_VALUE;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            double curr=(double)(nums[i]+nums[j])/2;
            if(curr<min)
                min=curr;
            i++;
            j--;
        }
        return min;
    }
}