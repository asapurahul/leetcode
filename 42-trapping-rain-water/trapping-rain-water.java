class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int vol = 0;

        int left[] = new int[n];
        left[0] = height[0];

        int right[] = new int[n];
        right[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            if (height[i] > left[i - 1])
                left[i] = height[i];
            else
                left[i] = left[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > right[i + 1])
                right[i] = height[i];
            else
                right[i] = right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            int currvol = Math.min(left[i], right[i]) - height[i];

            if (currvol > 0) {
                vol += currvol;
            }
        }

        return vol;
    }
}