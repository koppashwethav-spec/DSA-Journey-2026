package Arrays;

public class MinElement 
{
    public static void main(String[] args)
    {
        int[] arr ={10,5,8,2,15};
        int min = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
            System.out.println("Minimun element in array = " + min);
    }
}
