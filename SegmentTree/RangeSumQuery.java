package SegmentTree;

public class RangeSumQuery {

    static int[] tree;
    static int[] arr;

    static void build(int node, int start, int end) {

        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);

        tree[node] = tree[2 * node] + tree[2 * node + 1];
    }

    static int query(int node, int start, int end,
                     int left, int right) {

        if (right < start || end < left) {
            return 0;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        int leftSum = query(
                2 * node,
                start,
                mid,
                left,
                right
        );

        int rightSum = query(
                2 * node + 1,
                mid + 1,
                end,
                left,
                right
        );

        return leftSum + rightSum;
    }

    public static void main(String[] args) {

        arr = new int[]{1, 3, 5, 7, 9, 11};

        int n = arr.length;

        tree = new int[4 * n];

        build(1, 0, n - 1);

        int left = 1;
        int right = 4;

        int result = query(
                1,
                0,
                n - 1,
                left,
                right
        );

        System.out.println("Range Sum = " + result);
    }
}