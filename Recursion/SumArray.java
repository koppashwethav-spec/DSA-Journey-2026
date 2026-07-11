package Recursion;

public class SumArray 
{
   public static int sum(int[] arr, int index)
   {
      if(index == arr.length)
      {
        return 0;
      }
      return arr[index] + sum(arr, index + 1);
   }    
   public static void main(String[] args) 
   {
     int[] numbers = {2,4,6,8};
     int totalSum = sum(numbers, 0);
     System.out.println("Output : " +totalSum);    
   }
}
