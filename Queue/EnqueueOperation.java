package Queue;

public class EnqueueOperation 
{
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    
    public void enqueue(int value)
    {
        if(rear == queue.length-1)
        {
            System.out.println("Queue OverFlow");
            return;
        }
        queue[++rear] = value;
    }
    public void display()
    {
        if(front > rear)
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front; i<=rear; i++)
        {
            System.out.println(queue[i] + " ");
        }
    }
    public static void main(String[] args) 
    {
       EnqueueOperation q = new EnqueueOperation(); 
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.display();   
    }
}
