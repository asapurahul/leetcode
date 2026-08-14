class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            List<Character> l = new ArrayList<>();
            int curr = 0;

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (l.contains(ch)) {
                    int count = 0;

                    for (char c : l) {
                        if (c == ch) {
                            count++;
                        }
                    }

                    if (count == 2)
                        break;
                }

                l.add(ch);
                curr++;

                max = Math.max(max, curr);
            }
        }

        return max;
    }
}