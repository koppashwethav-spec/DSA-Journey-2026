package Greedy;

public class ActivitySelection 
{ 
    public static void main(String[] args) 
    {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        
        int count = 1;
        int lastFinish = finish[0];

        System.out.println("Selected Activities : ");
        System.out.println("Activity 1");

        for(int i=1; i<start.length; i++)
        {
            if(start[i] >= lastFinish)
            {
                System.out.println("Activity " + (i+1));
                count++;
                lastFinish = finish[i];
            }
        }
        System.out.println("Maximum Activities = " + count);
    }       
}
