class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int pref[] = new int[arr.length + 1];

        pref[0] = 0;

        for (int i = 1; i <= arr.length; i++) {
            pref[i] = arr[i - 1] + pref[i - 1];
        }

        for (int len = 1; len <= arr.length; len += 2) {
            for (int left = 0; left + len <= arr.length; left++) {
                int right = left + len;
                sum += pref[right] - pref[left];
            }
        }

        return sum;
    }
}