class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
                c++;
            }
            else
            {
                if(st.isEmpty() || st.peek()==')')
                    c++;
                else if(st.peek()=='(')
                {
                    c--;
                    st.pop();
                }
            }
                
        }
        return c;
    }
}