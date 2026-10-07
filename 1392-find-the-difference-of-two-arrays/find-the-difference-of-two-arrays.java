class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++)
            s1.add(nums1[i]);

        for(int i = 0; i < nums2.length; i++)
            s2.add(nums2[i]);

        List<List<Integer>> l = new LinkedList<>();
        l.add(new ArrayList<>());
        l.add(new ArrayList<>());

        for(int i = 0; i < nums1.length; i++) {
            if(!s2.contains(nums1[i]) && !l.get(0).contains(nums1[i]))
                l.get(0).add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(!s1.contains(nums2[i]) && !l.get(1).contains(nums2[i]))
                l.get(1).add(nums2[i]);
        }

        return l;
    }
}