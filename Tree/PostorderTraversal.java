package Tree;

public class PostorderTraversal 
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
    public static void Postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args)
    {
       Node root = new Node(10);
       root.left = new Node(20);
       root.right = new Node(30);
       root.left.left = new Node(40);
       root.left.right = new Node(50); 

       System.out.println("PostOrder Traversal");
       Postorder(root);
    }
}
