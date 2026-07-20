package Queue;

public class IsQueueEmpty 
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
    public void isEmpty()
    {
        if(front >rear)
        {
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is Not Empty");
        }
    }
    public static void main(String[] args) {
        IsQueueEmpty q =new IsQueueEmpty();
        q.isEmpty();
        q.enqueue(10);
        q.enqueue(20);
        q.isEmpty();
    }
}
