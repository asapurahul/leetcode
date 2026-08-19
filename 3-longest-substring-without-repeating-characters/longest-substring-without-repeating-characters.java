class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2){
            return s.length();
        }
        int ans=0;
        int left=0;
        int[] charIdx=new int[128];
        Arrays.fill(charIdx,-1);
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(charIdx[c]!=-1){
                left=Math.max(left,charIdx[c]+1);
            }
            charIdx[c]=right;
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}