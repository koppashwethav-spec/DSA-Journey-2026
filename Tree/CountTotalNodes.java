package Tree;

public class CountTotalNodes 
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
    public static int countNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        System.out.println("Total Node = " + countNode(root));   
    }
}
