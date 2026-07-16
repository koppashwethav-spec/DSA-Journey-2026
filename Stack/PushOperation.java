package Stack;

public class PushOperation 
{
   int[] stack = new int[5];
   int top = -1;

   public void push(int value)
   {
     if(top == stack.length - 1)
     {
        System.out.println("Stack OverFlow");
        return;
     }
     stack[++top] = value;
   }
   public void dispaly()
   {
    for(int i = 0; i<=top; i++)
    {
        System.out.print(stack[i] + " ");
    }
   }
   public static void main(String[] args)
   {
    PushOperation s = new PushOperation();
    s.push(10);
    s.push(20);
    s.push(30);
    s.dispaly();
   }

}
