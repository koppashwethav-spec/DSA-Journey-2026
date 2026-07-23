package Tree;

public class SearchElement
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
    public static boolean Search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        return Search(root.left, key) || Search(root.right, key);
    }
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        int key = 50;
        if(Search(root, key))
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
