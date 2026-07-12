package LinkedList;

public class CountNodes 
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
        Node third = new Node(30);
        
        first.next = second;
        second.next = third;

        Node temp = first;
        int count = 0;

        while(temp != null)
        {
            count++;
            temp = temp.next;
            
        }
        System.out.println("Number of Nodes = " + count);
    }
}
