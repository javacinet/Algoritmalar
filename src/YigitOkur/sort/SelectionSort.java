package YigitOkur.sort;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import org.jetbrains.annotations.NotNull;

public class SelectionSort {

   public static void SortTarafındanSeçiliyoruzMetodu(int[] array) {
      int n = array.length;

      if ((array == null) || (n <= 0)) {
         System.out.println("Sen gerçek deelsin");
//         throw new ArrayIndexOutOfBoundsException("Arayasın yok");
      }
      for (int i = 0; i < n - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < n; j++) {
            if (array[j] < array[minIndex]) {
               minIndex = j;
            }
         }

         if (minIndex != i) {
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
         }
      }
   }

   public static void printArray(int @NotNull [] array) {
      for (int i : array) {
         System.out.print(i + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int[] arayayım = {64, 25, 12, 22, 11};

      System.out.println("14 Mayıs Şort seçmiminden önce arayayım:");
      printArray(arayayım);
      SortTarafındanSeçiliyoruzMetodu(arayayım);
      System.out.println("28 Mayıs Şort seçimleri sonrası arayayım:");
      printArray(arayayım);

//      int array[] = new int[0];

//      selectionSort(array);
   }
}


