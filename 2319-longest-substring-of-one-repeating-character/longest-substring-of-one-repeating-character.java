class Solution {
    int[] left, right, best;
    char[] s;

    public int[] longestRepeating(String str, String queryCharacters, int[] queryIndices) {
        int n = str.length();
        s = str.toCharArray();

        left = new int[4 * n];
        right = new int[4 * n];
        best = new int[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {
            int index = queryIndices[i];
            s[index] = queryCharacters.charAt(i);

            update(1, 0, n - 1, index);

            ans[i] = best[1];
        }

        return ans;
    }

    void build(int node, int l, int r) {
        if (l == r) {
            left[node] = right[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node, l, r, mid);
    }

    void update(int node, int l, int r, int index) {
        if (l == r) {
            left[node] = right[node] = best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid)
            update(node * 2, l, mid, index);
        else
            update(node * 2 + 1, mid + 1, r, index);

        merge(node, l, r, mid);
    }

    void merge(int node, int l, int r, int mid) {
        int lc = node * 2;
        int rc = node * 2 + 1;

        left[node] = left[lc];
        right[node] = right[rc];
        best[node] = Math.max(best[lc], best[rc]);

        if (s[mid] == s[mid + 1]) {
            if (left[lc] == mid - l + 1)
                left[node] += left[rc];

            if (right[rc] == r - mid)
                right[node] += right[lc];

            best[node] = Math.max(best[node], right[lc] + left[rc]);
        }
    }
}