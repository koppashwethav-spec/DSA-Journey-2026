package Queue;

public class PeekOperation 
{
   int[]  queue = new int[5];
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

   public void peek()
   {
     if(front > rear)
     {
        System.out.println("Queue is Empty");
        return;
     }
     System.out.println("Front Element = " + queue[front]);
   }

   public static void main(String[] args)
   {
      PeekOperation q =new PeekOperation();
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.peek();
   }
} 
