package Queue;

public class DequeueOperation 
{
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    public void enqueue(int value) 
    {
        if (rear == queue.length - 1) 
        {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    public int dequeue() 
    {
        if (front > rear) 
        {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removedValue = queue[front];
        front++; 
        return removedValue;
    }

    public void display() 
    {
        if (front > rear) 
        {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) 
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        DequeueOperation q = new DequeueOperation();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.print("Queue after Enqueue: ");
        q.display(); 

        System.out.println("Dequeued: " + q.dequeue()); 
        System.out.println("Dequeued: " + q.dequeue()); 

        
        System.out.print("Queue after Dequeue: ");
        q.display(); 
    }
}