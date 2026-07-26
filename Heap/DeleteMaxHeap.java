package Heap;

public class DeleteMaxHeap {

    int[] heap = {90, 70, 50, 20, 30};
    int size = 5;

    public int delete() {

        if (size == 0) {
            System.out.println("Heap is Empty");
            return -1;
        }

        int deleted = heap[0];

        heap[0] = heap[size - 1];
        size--;

        int current = 0;

        while (true) {

            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int largest = current;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest == current) {
                break;
            }

            int temp = heap[current];
            heap[current] = heap[largest];
            heap[largest] = temp;

            current = largest;
        }

        return deleted;
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DeleteMaxHeap h = new DeleteMaxHeap();

        System.out.print("Before Delete: ");
        h.display();

        System.out.println("Deleted Element: " + h.delete());

        System.out.print("After Delete: ");
        h.display();
    }
}
