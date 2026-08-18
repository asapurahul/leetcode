class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int i=0;
        int n=nums.length;
        int j=n-1;
        while(i<j)
        {
            if(nums[j]==0)
            {
                j--;
            }
            else
            {
                if(nums[i]==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j--;
                    count++;
                }
                i++;
            }
        }
        return count;
    }
}