package YigitOkur.sort;

import ogrenciler.YigitOkur.sort.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

class MergeSortTest {

   @Test
   void testMergeSort() {
      int[] array = {12, 11, 13, 5, 6, 7};
      MergeSort.mergeSort(array, 0, array.length - 1);
      assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, array);
   }

   @Test
   void testEmptyArray() {
      int[] array = {};
      MergeSort.mergeSort(array, 0, array.length - 1);
      assertArrayEquals(new int[]{}, array);
   }

   @Test
   void testSingleElementArray() {
      int[] array = {5};
      MergeSort.mergeSort(array, 0, array.length - 1);
      assertArrayEquals(new int[]{5}, array);
   }
}