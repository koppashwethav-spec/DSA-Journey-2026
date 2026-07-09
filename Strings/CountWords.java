package Strings;

public class CountWords 
{
    public static void main(String[] args)
    {
        String str = "Java is easy";
        String[] words = str.split(" ");
        System.out.println("Number of Words = " +words.length);
    }
}
