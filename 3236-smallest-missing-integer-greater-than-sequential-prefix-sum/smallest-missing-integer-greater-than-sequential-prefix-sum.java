class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1==nums[i])
                sum+=nums[i];
            else break;
        }
        HashSet<Integer> map=new HashSet<>();
        for(int num:nums){
            map.add(num);
        }
        while(map.contains(sum))
        {
            sum+=1;
        }
        return sum;
    }
}