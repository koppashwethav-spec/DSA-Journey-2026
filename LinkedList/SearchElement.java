package LinkedList;

public class SearchElement 
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
    public static void main(String[]  args)
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        int key = 30;
        boolean found = false;

        Node temp = first;

        while(temp != null)
        {
            if(temp.data == key)
            {
                found =true;
                break;
            }
            temp =temp.next;
        }
        if(found)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}
