package Heap;

public class MaxHeap 
{
    int[] heap = new int[10];
    int size = 0;  

    public void insert(int value)
    {
        heap[size] = value;
        int current = size;
        size++;

        while(current > 0)
        {
            int parent = (current - 1)/2;

            if(heap[parent] < heap[current])
            {
                int temp = heap[parent];
                heap[parent] = heap[current];
                heap[current] = temp;

                current = parent;
            }else{
                break;
            }
        }
    }
    public void display()
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();
        h.insert(50);
        h.insert(30);
        h.insert(70);
        h.insert(20);
        h.insert(90);

        System.out.println("Max Heap: ");
        h.display();
    }
}
