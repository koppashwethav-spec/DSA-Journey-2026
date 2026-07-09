package Recursion;

public class Print1ToN 
{
   public static void printNumber(int n)
   {
       if(n == 0)
       {
        return;
       }
       printNumber(n-1);
       System.out.println(n);
   }    
   public static void main(String[] args) 
   {
       int n=5;
       System.out.println("Printing 1 to " + n + ":");
       printNumber(n);
   }
}
