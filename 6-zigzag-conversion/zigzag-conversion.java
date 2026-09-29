class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int idx = i;
            int deltaDown = 2 * (numRows - i - 1),deltaUp = 2 * i;
            boolean goingDown = true;
            while (idx < s.length()) {
                builder.append(s.charAt(idx));
                if (i == 0) {
                    idx += deltaDown;
                } else if (i == numRows-1) {
                    idx += deltaUp;
                } else {
                    if (goingDown) {
                        idx += deltaDown;
                    } else {
                        idx += deltaUp;
                    }
                    goingDown = !goingDown;
                }
            }
        }
        return builder.toString();
    }
}