class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder res=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int pos=indices[i];
            res.setCharAt(pos,ch);
        }
        return res.toString();
    }
}