package LinkedList;

public class DeleteLastNode 
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data= data;
            this.next = null;
        }
    }
    public static void main(String[] args)
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node temp = first;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        temp.next = null;
        temp = first;
        while(temp != null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
