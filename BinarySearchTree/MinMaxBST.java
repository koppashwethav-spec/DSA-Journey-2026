package BinarySearchTree;

public class MinMaxBST
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
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
    public static int findMin(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root.data;
    }
    public static int findMax(Node root)
    {
        while(root.right != null)
        {
            root = root.right;
        }
        return root.data;
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

        System.out.println("Minimum = " + findMin(root));
        System.out.println("Maximum = " + findMax(root));
    }
}

