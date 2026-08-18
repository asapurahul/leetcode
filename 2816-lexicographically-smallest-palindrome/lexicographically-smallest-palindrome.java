class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {   
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2)
            {
                if(ch1 > ch2)
                    s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1);
                else
                    s = s.substring(0, j) + s.charAt(i) + s.substring(j + 1);
            }
            i++;
            j--;
        }
        return s;
    }
}