package Hashing;

import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int number : arr) {

            if (set.contains(number)) {
                System.out.println("Duplicate Element: " + number);
                return;
            }

            set.add(number);
        }

        System.out.println("No Duplicate Element");
    }
}