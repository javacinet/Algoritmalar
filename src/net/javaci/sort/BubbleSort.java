package net.javaci.sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * Bubble sort method
     */
    public static void sort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    /**
     * A test method
     */
    public static void main(String[] args) {
        int[] list = {-2, 1, 2, 2, 3, 3, 5, 6, 12, 14};
        sort(list);
        System.out.print(Arrays.toString(list));
    }
}
// [-2, 1, 2, 2, 3, 3, 5, 6, 12, 14]