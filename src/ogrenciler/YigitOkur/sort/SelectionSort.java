package ogrenciler.YigitOkur.sort;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

public class SelectionSort {
   public static void selectionSort(int[] array) {
      int n = array.length;
      for (int i = 0; i < n - 1; i++) {
         int minIdx = i;
         for (int j = i + 1; j < n; j++) {
            if (array[j] < array[minIdx]) {
               minIdx = j;
            }
         }
         int temp = array[minIdx];
         array[minIdx] = array[i];
         array[i] = temp;
      }
   }

   public static void main(String[] args) {
      int[] array = {64, 25, 12, 22, 11};
      selectionSort(array);
      System.out.println("Sorted array: ");
      for (int j : array) {
         System.out.print(j + " ");
      }
   }
}