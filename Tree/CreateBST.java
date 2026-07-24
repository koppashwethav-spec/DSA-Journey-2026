package Tree;

public class CreateBST
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
        else if (value > root.data)
        {
            root.right = insert(root.right, value);
        }
            return root;
     }
        public static void inordre(Node root)
        {
            if(root == null)
            {
                return;
            }
            inordre(root.left);
            System.out.print(root.data +  " ");
            inordre(root.right);
        }
        public static void main(String[] args) 
        {
            Node root = null;
            root = insert(root,50);
            root = insert(root, 30);
            root = insert(root, 70);
            root = insert(root, 20);
            root = insert(root, 40);
            root = insert(root, 60);
            root = insert(root, 80);
            System.out.println("Inorder Traversal: ");
            inordre(root);
        }
}
