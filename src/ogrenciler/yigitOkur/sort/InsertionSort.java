package ogrenciler.yigitOkur.sort;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */


public class InsertionSort {
   public static void insertionSort(int[] array) {
      int n = array.length;
      for (int i = 1; i < n; ++i) {
         int key = array[i];
         int j = i - 1;
         while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
         }
         array[j + 1] = key;
      }
   }

   public static void main(String[] args) {
      int[] array = {12, 11, 13, 5, 6};
      insertionSort(array);
      System.out.println("Sorted array: ");
      for (int j : array) {
         System.out.print(j + " ");
      }
   }
}