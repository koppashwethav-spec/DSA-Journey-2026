package Hashing;
import java.util.HashMap;

public class FirstNonRepeatingCharacter 
{
    public static void main(String[] args) 
    {
         String str = "programming";
         HashMap<Character, Integer> map = new HashMap<>(); 
         for(char ch: str.toCharArray())
            {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }  

         for(char ch : str.toCharArray())
            {
                if(map.get(ch) == 1)
                {
                    System.out.println("First Non-Repeating Character : " + ch);
                    return;
                }
            }
            System.out.println("No Non-Repeating Character Found");   
    }    
}
