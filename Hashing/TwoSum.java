package Hashing;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            int required = target - current;

            if (map.containsKey(required)) {

                System.out.println(
                    required + " + " + current + " = " + target
                );

                return;
            }

            map.put(current, i);
        }

        System.out.println("No Two Sum Found");
    }
}