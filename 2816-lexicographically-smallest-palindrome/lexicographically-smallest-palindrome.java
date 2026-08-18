class Solution {
    public String makeSmallestPalindrome(String s) {
        char [] arr = s.toCharArray();

        for(int i=0, j = arr.length-1; i<j; i++, j--){
            int minIndex = arr[i] >= arr[j] ? j :i;
            int maxIndex = arr[i] < arr[j] ? j :i;

            arr[maxIndex] = arr[minIndex]; 
           
        }

        return new String(arr);
    }
}