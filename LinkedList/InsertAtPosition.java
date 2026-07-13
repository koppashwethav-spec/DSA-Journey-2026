package LinkedList;

public class InsertAtPosition 
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
        Node second = new Node(30);
        
        first.next = second;

        Node newNode = new Node(20);
        int position  = 2;
        Node temp = first;
         
        for(int i=1; i<position-1; i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next =newNode;

        temp=first;

        while(temp != null)
        {
            System.out.println(temp.data + " ");
            temp =temp.next;
        }
   }
}
