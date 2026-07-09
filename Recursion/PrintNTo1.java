package Recursion;

public class PrintNTo1 
{
    public static void printNumber(int n)
    {
        if(n == 0 )
        {
            return;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }
    public static void main(String[] args) 
    {
        int n = 10;
        System.out.println("Printing n to " + 10 + ":");
        printNumber(n);
    }
}
