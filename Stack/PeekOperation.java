package Stack;

public class PeekOperation 
{
    int[] stack = new int[5];
    int top = -1;
    
    public void push(int value)
    {
        if(top == stack.length-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }
    public void peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return;
        }
            System.out.println("Top Element = " + stack[top]);
    }
       public static void main(String[] args)
       {
         PeekOperation s =new PeekOperation();
         s.push(10);
         s.push(20);
         s.push(30);
         s.peek();
       }
}
