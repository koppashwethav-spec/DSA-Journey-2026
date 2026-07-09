package Strings;

public class CountVowelsConsonants 
{
    public static void main(String[] args) 
    {
        String str = "Hello World".toLowerCase();
        int Vowels = 0;
        int Consonants =0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                Vowels++;
            }
            else if(ch>='a' && ch<='z')
            {
                Consonants++;
            }
        }
           System.out.println("Orginal String = " + str);
           System.out.println("Vowels = " + Vowels);
           System.out.println("Consonants = " +Consonants);
    }
}
