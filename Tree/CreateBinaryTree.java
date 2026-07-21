package Tree;

public class CreateBinaryTree 
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
    public static void main(String[] args) 
    {
       Node root = new Node(10);
       root.left = new Node(20);
       root.right = new Node(30);
       root.left.left = new Node(40);
       root.left.right = new Node(50);
       
       System.out.println("Root Node = " + root.data);
       System.out.println("Left Child = " + root.left.data);
       System.out.println("Right Child = " + root.right.data);
    }
}
