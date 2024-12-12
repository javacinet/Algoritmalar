package net.javaci.sort;

import java.util.Arrays;
import java.util.Random;

public class SortCompare {

    public static void main(String[] args) {
        int[] arrayClone;

        for (int n = 1000; n < 1_000_000; n *= 10) {
            long start = System.currentTimeMillis();
            int[] array = generateRandomArray(n);
            long end = System.currentTimeMillis();
            System.out.println("Array generation takes " + (end - start) + " ms for " + n + " items");

            start = System.currentTimeMillis();
            arrayClone = array.clone();
            Arrays.sort(arrayClone);
            end = System.currentTimeMillis();
            System.out.println("Arrays.sort takes " + (end - start) + " ms");

            start = System.currentTimeMillis();
            arrayClone = array.clone();
            InsertionSort.sort(arrayClone);
            end = System.currentTimeMillis();
            System.out.println("InsertionSort takes " + (end - start) + " ms");

            start = System.currentTimeMillis();
            arrayClone = array.clone();
            SelectionSort.sort(arrayClone);
            end = System.currentTimeMillis();
            System.out.println("SelectionSort takes " + (end - start) + " ms");

            start = System.currentTimeMillis();
            arrayClone = array.clone();
            BubbleSort.sort(arrayClone);
            end = System.currentTimeMillis();
            System.out.println("BubbleSort takes " + (end - start) + " ms");

            System.out.println("---------------");
        }
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt();
        }
        return array;
    }

    // TODO generik sort meyodu yazilacak
    public static <T extends Comparable<T>> void sort(T[] a) {

    }
}
