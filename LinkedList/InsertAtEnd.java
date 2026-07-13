package LinkedList;

public class InsertAtEnd 
{
    static class Node
    {
         int data;
         Node next;

         Node(int data)
         {
            this.data = data;
            this.next = null;
         }
    }

    public static void main(String[] args)
    {
        Node first = new Node(10);
        Node second = new Node(20);

        first.next = second;

        Node newNode = new Node(30);
        Node temp = first;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        temp = first;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
