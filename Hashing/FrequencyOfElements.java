package Hashing;

import java.util.HashMap;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int number : arr) {

            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }

        System.out.println("Element Frequency:");

        for (int number : frequency.keySet()) {
            System.out.println(number + " -> " + frequency.get(number));
        }
    }
}