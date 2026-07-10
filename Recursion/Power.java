package Recursion;

public class Power 
{
    public static int Power(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return x * Power(x, n-1);
    }
   public static void main(String[] args) 
   {
        int x = 3;
        int n = 5;
        int result = Power(x, n);
        System.out.println(x + " to the power of " + n + " = " + result);
   } 
}
