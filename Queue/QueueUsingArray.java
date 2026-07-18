package Queue;

public class QueueUsingArray 
{
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    
    public static void main(String[] args) 
    {
        QueueUsingArray q = new QueueUsingArray();
        q.queue[++q.rear] = 10;
        q.queue[++q.rear] = 20;
        q.queue[++q.rear] = 30;
        
        for(int i=q.front; i<=q.rear; i++)
        {
            System.out.println(q.queue[i] + " ");
        }
    }
}
