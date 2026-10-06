class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int val=(int)ch;
            sum=sum+(26-(val%97))*(i+1);
        }
        return sum;
    }
}