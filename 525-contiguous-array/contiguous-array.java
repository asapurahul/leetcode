class Solution {

    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();

        int sum = 0;
        int size = 0;

        h.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1)
                sum += 1;
            else
                sum -= 1;

            if (h.containsKey(sum)) {

                if (i - h.get(sum) > size)
                    size = i - h.get(sum);

            } else {
                h.put(sum, i);
            }
        }

        return size;
    }
}