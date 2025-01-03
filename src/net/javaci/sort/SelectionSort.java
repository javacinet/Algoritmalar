package net.javaci.sort;

public class SelectionSort {

    /** The method for sorting the numbers */
    // O(n^2)
    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
}
