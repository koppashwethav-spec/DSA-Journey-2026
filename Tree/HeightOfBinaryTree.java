package Tree;

public class HeightOfBinaryTree
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
   public static int height(Node root)
   {
       if(root == null)
         {
            return 0;
         }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
   }
   public static void main(String[] args) 
   {
     Node root = new Node(10);
     root.left = new Node(20);
     root.right = new Node(30);
     root.left.left = new Node(40);
     root.left.right = new Node(50);  
     System.out.println("Height = " + height(root));  
   }
}
