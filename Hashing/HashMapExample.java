package Hashing;

import java.util.HashMap;

public class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Shwetha");
        map.put(102, "Swathi");
        map.put(103, "Girish");
        System.out.println("HashMap : " + map);
        
        System.out.println("Student 101 : " + map.get(101));

        System.out.println("Contains Key 102 : " + map.containsKey(102));

        map.remove(103);
        System.out.println("After Remove : " + map);
        System.out.println("Size : " + map.size());
    } 
}
