package Recursion;

public class Fibonacci 
{
    public static int fibo(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        return fibo(n-1) + fibo(n - 2);
    }
    public static void main(String[] args) 
    {
        int n = 10;
        int result = fibo(n);
        System.out.println("The " + n + "th fibonacci number is = " + result);

    }
}
