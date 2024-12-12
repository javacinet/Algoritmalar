package ogrenciler.YigitOkur.sort;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

public class MergeSort {
   public static void mergeSort(int[] array, int left, int right) {
      if (left < right) {
         int mid = (left + right) / 2;
         mergeSort(array, left, mid);
         mergeSort(array, mid + 1, right);
         merge(array, left, mid, right);
      }
   }

   public static void merge(int[] array, int left, int mid, int right) {
      int n1 = mid - left + 1;
      int n2 = right - mid;
      int[] L = new int[n1];
      int[] R = new int[n2];
      System.arraycopy(array, left, L, 0, n1);
      System.arraycopy(array, mid + 1, R, 0, n2);
      int i = 0, j = 0;
      int k = left;
      while (i < n1 && j < n2) {
         if (L[i] <= R[j]) {
            array[k] = L[i];
            i++;
         } else {
            array[k] = R[j];
            j++;
         }
         k++;
      }
      while (i < n1) {
         array[k] = L[i];
         i++;
         k++;
      }
      while (j < n2) {
         array[k] = R[j];
         j++;
         k++;
      }
   }

   public static void main(String[] args) {
      int[] array = {12, 11, 13, 5, 6, 7};
      mergeSort(array, 0, array.length - 1);
      System.out.println("Sorted array: ");
      for (int j : array) {
         System.out.print(j + " ");
      }
   }
}