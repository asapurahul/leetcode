class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(n<m)
            return -1;
        for(int i=0;i<=n-m;i++)
        {
            int temp=i;
            int c=0;
            for(int ind=0;ind<m;ind++)
            {
                if(haystack.charAt(temp)!=needle.charAt(ind))
                    c++;
                temp++;
            }
            if(c==0)
                return i;
        }
        return -1;
    }
}