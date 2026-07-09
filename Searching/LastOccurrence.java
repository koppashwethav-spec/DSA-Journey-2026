package Searching;

public class LastOccurrence 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,4,4,4,6,8};
        int target = 4;
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(arr[mid] == target)
            {
                result = mid;
                left = mid+1;
            }
            else if(arr[mid]<target)
            {
                left =mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        if(result != -1)
        {
            System.out.println("Last Occurrence = " + result);
        }else{
            System.out.println("Elemnt not found");
        }
    }
}
