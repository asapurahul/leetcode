class Solution {
    public void reverse(char [] ch,int size){
        int left = 0;
        int right = size-1;
        while(left <= right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

    }
    public String reverseByType(String s) {
        int i = 0;
        int j = 0;
        char [] chars = s.toCharArray();
        char [] letter = new char[chars.length];
        char [] special = new char[chars.length];
        for(char ch : chars){
            if(Character.isLetterOrDigit(ch)){
                letter[i++] = ch;
            }
            else{
                special[j++] = ch;
            }
        }
        reverse(letter,i);
        reverse(special,j);
        int pc = 0;
        int ps = 0;
        for(int right =0;right < chars.length;right++){
            if(Character.isLetterOrDigit(chars[right])){
                chars[right] = letter[pc];
                pc++;
            }
            else{
                chars[right] = special[ps];
                ps++;
            }
        }
        return new String(chars);
    }
}