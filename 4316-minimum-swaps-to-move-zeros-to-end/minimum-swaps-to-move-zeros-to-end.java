class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int i=0;
        int n=nums.length;
        int j=n-1;
        while(i<j)
        {
            if (nums[i] != 0) {
                i++;
            }
            else if (nums[j] == 0) {
                j--;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}