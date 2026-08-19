class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[]=new int[2];
        Arrays.fill(res,-1);
        int i=0;
        int j=numbers.length-1;
        while(i<j)
        {
            int curr=numbers[i]+numbers[j];
            if(curr==target)
            {
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
            else if(curr<target)
                i++;
            else
                j--;
        }
        return res;
    }
}