class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if(extraCandies+candies[i]>=max)
            {
                b.add(true);
            }
            else
                b.add(false);
        }
        return b;
    }
}