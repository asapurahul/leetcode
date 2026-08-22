class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int res=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            p*=r;
            res=sum+p;
            n/=10;
        }
        return temp%res==0;
    }
}