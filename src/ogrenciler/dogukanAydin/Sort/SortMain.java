package ogrenciler.dogukanAydin.Sort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] array = new int[750];
        for (int i = 0; i < 750; i++) {
            int num = (int) (Math.random() * 1000);
            array[i] = num;
        }

        int[] officialArray = new int[750];
        officialArray = array.clone();

      //  System.out.println("Array is        :" + Arrays.toString(array));

        long startTime = System.currentTimeMillis();
        MyBubbleSort.BubbleSort(array);
        long endTime = System.currentTimeMillis();
       // System.out.println("Sorted array is: " + Arrays.toString(array));
        System.out.println("BubbleSort süre : " + (endTime - startTime)  + "ms");

        array = officialArray;
        startTime = System.currentTimeMillis();
        MyInsertionSort.insertionSort(array);
        endTime = System.currentTimeMillis();
      //  System.out.println("Sorted array is: " + Arrays.toString(array));
        System.out.println("InsertionSort süre : " + (endTime - startTime) + "ms");

      //  array = officialArray;
      // startTime = System.currentTimeMillis();
      //  MySelectionSort.selectionSort(array);
      //  endTime = System.currentTimeMillis();
      //  System.out.println("Sorted array is: " + Arrays.toString(array));
      //  System.out.println("SelectionSort süre : " + (endTime - startTime) + "ms");

        array = officialArray;
        startTime = System.currentTimeMillis();
        MyQuickSort.QuickSort(array);
        endTime = System.currentTimeMillis();
       // System.out.println("Sorted array is: " + Arrays.toString(array));
        System.out.println("QuickSort süre : " + (endTime - startTime) + "ms");
    }
}
