class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        for(int i=n;i<=100;i++)
        {
            int p=1;
            int temp=i;
            while(temp>0)
            {
                int r=temp%10;
                p=p*r;
                temp=temp/10;
            }
            if(p%t==0)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}