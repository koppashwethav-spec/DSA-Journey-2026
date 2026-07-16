package Stack;

public class StackUsingArray 
{
    int[] stack = new int[5];
    int top = -1;

    public static void main(String[] args) 
    {
       StackUsingArray s = new StackUsingArray();
       s.stack[++s.top] = 10;
       s.stack[++s.top] = 20;
       s.stack[++s.top] = 30;
       
       for(int i=0; i<=s.top; i++)
       {
         System.out.println(s.stack[i] + " ");
       }
    }
}
