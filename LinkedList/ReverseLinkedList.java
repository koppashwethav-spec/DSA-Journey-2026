package LinkedList;

public class ReverseLinkedList 
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
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        Node prev = null;
        Node current = first;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node temp = prev;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
   }
}
