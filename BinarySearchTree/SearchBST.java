package BinarySearchTree;

public class SearchBST
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int value)
    {
        if(root == null)
        {
            return new Node(value);
        }

        if(value < root.data)
        {
            root.left = insert(root.left, value);
        }
        else if(value > root.data)
        {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }

        if(key < root.data)
        {
            return search(root.left, key);
        }
        else
        {
            return search(root.right, key);
        }
    }

    public static void main(String[] args)
    {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        int key = 60;

        if(search(root, key))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}
