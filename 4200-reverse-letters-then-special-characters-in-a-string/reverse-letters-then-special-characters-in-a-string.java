class Solution {
    public String reverseByType(String s) {
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        StringBuilder sb=new StringBuilder();
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
                s1.push(ch);
            else
            {
                s2.push(ch);
                l.add(i);
            }
            i++;
        }
        i=0;
        while(i<s.length())
        {
            if(l.contains(i))
                sb.append(s2.pop());
            else
                sb.append(s1.pop());
            i++;
        }
        return sb.toString();
    }
}