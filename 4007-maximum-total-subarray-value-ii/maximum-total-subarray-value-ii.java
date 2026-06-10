import java.util.*;

class SparseTable {
    int n;
    int[][] mn;
    int[][] mx;
    int[] logVal;

    public SparseTable(int[] a) {
        n = a.length;
        int maxLog = 32 - Integer.numberOfLeadingZeros(n);

        mn = new int[n][maxLog];
        mx = new int[n][maxLog];
        logVal = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            logVal[i] = logVal[i / 2] + 1;
        }

        for (int i = 0; i < n; i++) {
            mn[i][0] = a[i];
            mx[i][0] = a[i];
        }

        for (int j = 1; (1 << j) <= n; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                mn[i][j] = Math.min(
                    mn[i][j - 1],
                    mn[i + (1 << (j - 1))][j - 1]
                );

                mx[i][j] = Math.max(
                    mx[i][j - 1],
                    mx[i + (1 << (j - 1))][j - 1]
                );
            }
        }
    }

    public int queryMin(int l, int r) {
        int j = logVal[r - l + 1];
        return Math.min(
            mn[l][j],
            mn[r - (1 << j) + 1][j]
        );
    }

    public int queryMax(int l, int r) {
        int j = logVal[r - l + 1];
        return Math.max(
            mx[l][j],
            mx[r - (1 << j) + 1][j]
        );
    }
}

class Solution {

    static class Node {
        int value;
        int l;
        int r;

        Node(int value, int l, int r) {
            this.value = value;
            this.l = l;
            this.r = r;
        }
    }

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;

        SparseTable st = new SparseTable(nums);

        TreeSet<Node> set = new TreeSet<>((a, b) -> {
            if (a.value != b.value)
                return Integer.compare(a.value, b.value);
            if (a.l != b.l)
                return Integer.compare(a.l, b.l);
            return Integer.compare(a.r, b.r);
        });

        for (int i = 0; i < n; i++) {
            int diff = st.queryMax(0, i) - st.queryMin(0, i);
            set.add(new Node(diff, 0, i));
        }

        while (k-- > 0) {
            Node cur = set.pollLast();

            ans += cur.value;

            if (cur.l + 1 <= cur.r) {
                int diff = st.queryMax(cur.l + 1, cur.r)
                         - st.queryMin(cur.l + 1, cur.r);

                set.add(new Node(diff, cur.l + 1, cur.r));
            }
        }

        return ans;
    }
}