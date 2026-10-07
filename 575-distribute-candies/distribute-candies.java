class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2; 
        Set<Integer> typeSet = new HashSet(); 
        for(int type : candyType) typeSet.add(type); 
        return Math.min(typeSet.size(), max);
    }
}