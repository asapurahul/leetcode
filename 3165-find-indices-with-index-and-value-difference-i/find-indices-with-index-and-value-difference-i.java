class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        int res[]=new int[2];
        Arrays.fill(res,-1);
        for(int i=0;i<n-indexDifference;i++)
        {
            for(int j=i+indexDifference;j<n;j++)
            {
                if(Math.abs(nums[i]-nums[j])>=valueDifference)
                {
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
            if(res[0]!=-1)
                break;
        }
        return res;
    }
}