class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1==nums[i])
                sum+=nums[i];
            else break;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        while(map.containsKey(sum))
        {
            sum+=1;
        }
        return sum;
    }
}