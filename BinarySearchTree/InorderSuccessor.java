package BinarySearchTree;

public class InorderSuccessor {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {

        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    public static Node inorderSuccessor(Node root, int key) {

        Node successor = null;

        while (root != null) {

            if (key < root.data) {
                successor = root;
                root = root.left;
            }
            else if (key > root.data) {
                root = root.right;
            }
            else {
                if (root.right != null) {

                    Node temp = root.right;

                    while (temp.left != null) {
                        temp = temp.left;
                    }

                    successor = temp;
                }
                break;
            }
        }

        return successor;
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        int key = 50;

        Node ans = inorderSuccessor(root, key);

        if (ans != null)
            System.out.println("Successor = " + ans.data);
        else
            System.out.println("No Successor");
    }
}
