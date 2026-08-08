class Solution {
    public long sumAndMultiply(int n) {
        long val=0;
        long sum=0;
        int i=0;
        while(n>0)
        {
            long r=n%10;
            if(r!=0)
            {
                val=r*(long)(Math.pow(10,i))+val;
                i++;
                sum+=r;
            }
            n/=10;
        }
        return val*sum;
    }
}