class Solution {
    public int distributeCandies(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]))
                sum+=1;
            s.add(nums[i]);
        }
        int pos=nums.length/2;
        return Math.min(pos,sum);
    }
}