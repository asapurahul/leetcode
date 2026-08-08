class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for(int i = 0; i < text.length(); i++) {
            char curr = text.charAt(i);

            if(curr == 'b')
                b++;
            else if(curr == 'a')
                a++;
            else if(curr == 'l')
                l++;
            else if(curr == 'o')
                o++;
            else if(curr == 'n')
                n++;
        }

        if(b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1)
            return Math.min(b, Math.min(a, Math.min(l / 2, Math.min(o/2, n))));

        return 0;
    }
}