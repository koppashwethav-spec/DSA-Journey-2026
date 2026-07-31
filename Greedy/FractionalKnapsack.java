package Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {

    public static void main(String[] args) {

        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;

        Arrays.sort(items, Comparator.comparingDouble(i -> -(double) i.value / i.weight));

        double totalValue = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += ((double) item.value / item.weight) * capacity;
                break;
            }
        }

        System.out.println("Maximum Value = " + totalValue);
    }
}