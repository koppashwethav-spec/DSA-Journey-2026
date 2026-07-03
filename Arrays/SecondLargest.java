package Arrays;

public class SecondLargest 
{
    public static void main(String[] args) 
    {
         int[] arr ={10,25,40,15,30};
         int largest = Integer.MIN_VALUE;
         int SecondLargest = Integer.MIN_VALUE;
         for(int i : arr)
         {
            if(i > largest)
            {
                SecondLargest = largest;
                largest = i;
            }
            else if(i > SecondLargest && i!=largest)
            {
                SecondLargest = i;
            }
         }
        System.out.println("First Largest Number = " + largest);
        System.out.println("Seocnd Largest Number = " + SecondLargest);
    }
}
