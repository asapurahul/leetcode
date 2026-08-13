class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        int res=1;
        while(true)
        {
            int c=0;
            for(int i=0;i<nums.length;i++)
            {
                if(res+nums[i]<1)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                break;
            }
            res+=1;
        }
        return res;
    }
}