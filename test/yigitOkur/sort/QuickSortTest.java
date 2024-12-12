package yigitOkur.sort;

import ogrenciler.yigitOkur.sort.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

class QuickSortTest {

   @Test
   void testQuickSort() {
      int[] array = {10, 7, 8, 9, 1, 5};
      QuickSort.quickSort(array, 0, array.length - 1);
      assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, array);
   }

   @Test
   void testEmptyArray() {
      int[] array = {};
      QuickSort.quickSort(array, 0, array.length - 1);
      assertArrayEquals(new int[]{}, array);
   }

   @Test
   void testSingleElementArray() {
      int[] array = {5};
      QuickSort.quickSort(array, 0, array.length - 1);
      assertArrayEquals(new int[]{5}, array);
   }
}