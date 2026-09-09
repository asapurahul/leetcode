class Solution {
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);

        long mod = 1_000_000_007;
        long ans = 0;
        long sum = 0;

        for(int x: nums) {
            ans = (ans + (long)x * x % mod * (x + sum)) % mod;
            sum = (2 * sum + x) % mod;
        }
        return (int) ans;
    }
}