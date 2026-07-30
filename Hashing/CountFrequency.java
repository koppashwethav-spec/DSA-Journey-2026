package Hashing;

import java.util.HashMap;

public class CountFrequency 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 10, 30, 20, 10};
        HashMap<Integer, Integer> map = new HashMap<>();    
        for(int num : arr)
        {
           map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.print("Element Frequencies:" + map);
    }    
}
