package Tree;

public class CountLeafNodes 
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
    public static int CountLeafNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null  && root.right == null)
        {
            return 1;
        }
        return CountLeafNodes(root.left) +CountLeafNodes(root.right);
    }
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);   
        System.err.println("Leaf Nodes = " + CountLeafNodes(root));
    }
}
