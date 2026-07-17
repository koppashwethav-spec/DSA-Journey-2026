package Stack;

public class IsEmpty 
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
     public void IsEmpty()
     {
        if(top == -1)
     {
        System.out.println("Stack is empty");
     }
     else{
        System.out.println("Stack is Not empty");
     }
   }
   public static void main(String[] args) {
       IsEmpty s = new IsEmpty();
       s.IsEmpty();
       s.push(10);
       s.push(20);
       s.IsEmpty();
   }
}
