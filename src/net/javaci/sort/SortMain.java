package net.javaci.sort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] array = {44, -12, 77, 91, 3};
        SelectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
