package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal 
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
    public static void LevelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if(current.left != null)
            {
                queue.add(current.left);
            }
            if(current.right != null)
            {
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        System.out.println("Level Order Traversal");
        LevelOrder(root);
    }
}
