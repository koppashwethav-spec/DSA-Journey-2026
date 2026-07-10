package Recursion;

public class SumOfN 
{
    public static int sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n + sum(n-1);

    }
    public static void main(String[] args) 
    {
        int n =10;
        int result = sum(n);
        System.out.println("Sum of 1st to " + n + " Numbers = " +result);
    }
}
