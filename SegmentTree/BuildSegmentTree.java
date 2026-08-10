package SegmentTree;

public class BuildSegmentTree {

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

    public static void main(String[] args) {

        arr = new int[]{1, 3, 5, 7, 9, 11};

        int n = arr.length;

        tree = new int[4 * n];

        build(1, 0, n - 1);

        System.out.println("Segment Tree Built Successfully");

        System.out.println("Root Sum = " + tree[1]);
    }
}