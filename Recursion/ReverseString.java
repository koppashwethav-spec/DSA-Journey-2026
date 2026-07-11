package Recursion;

public class ReverseString 
{
    public static void reverse(String str, int index)
    {
        if(index < 0)
        {
            return;
        }
        System.out.print(str.charAt(index));
        reverse(str, index-1);
    }
   public static void main(String[] args)
   {
    String input = "hello";
    System.out.println("Output : " );
    reverse(input, input.length()-1);
    System.out.println(" ");
   } 
}
