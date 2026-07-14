package LinkedList;

public class DeleteNodeByValue 
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
    
       int value = 20;
       Node temp =first;

       while(temp != null && temp.next.data != value)
       {
        temp=temp.next;
       }
       if(temp.next != null)
       {
        temp.next = temp.next.next;
       }
       temp = first;
       while(temp != null)
       {
        System.out.println(temp.data + " ");
        temp =temp.next;
       }
    }
}
