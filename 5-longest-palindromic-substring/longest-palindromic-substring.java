class Solution {
    /*
        String longest = "";

        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    int sub = 0;
                    String temp = s.substring(i, j+1);

                    while(i+sub <= j-sub) {
                        if(s.charAt(i+sub) != s.charAt(j-sub)) {
                            temp = "";
                            break;
                        }
                        sub++;
                    }

                    if(temp.length() > longest.length()) longest = temp;
                }
            }
        }

        return longest;
    */
    
    private int start = 0;
    private int end = 0;

    public String longestPalindrome(String s) {
        solve(s.toCharArray(), 0);

        return s.substring(start, end+1);
    }

    private void solve(char[] s, int m) {
        if(s.length - m < (end-start)/2){
            return;
        }

        int right = m;
        int left = m;

        while(right+1 < s.length && s[right] == s[right+1]) {
            right++;
        }

        m = right;

        while(left-1 >= 0 && right+1 < s.length && s[left-1] == s[right+1]) {
            right ++;
            left--;
        }

        if (end - start < right - left) {
            start = left;
            end = right;
        }

        solve(s, m + 1);
    }
} 