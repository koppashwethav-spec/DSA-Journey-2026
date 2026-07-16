package Stack;

public class PopOperation
{
    int[] stack = new int[5];
    int top = -1;

    public void push(int value)
    {
        if(top == stack.length - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Deleted Element = " + stack[top]);
        top--;
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");
            return;
        }

        for(int i = top; i >= 0; i--)
        {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        PopOperation s = new PopOperation();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();

        s.display();
    }
}