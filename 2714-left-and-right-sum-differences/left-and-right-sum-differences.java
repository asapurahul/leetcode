class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0;
        int right=0;
        int total=0;
        int n= nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        for(int i=0;i<n;i++){
            right=total-left-nums[i];
            arr[i]=Math.abs(right-left);
            left = left+nums[i];

        }
        return arr;
    }
}