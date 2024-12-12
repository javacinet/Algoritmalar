package YigitOkur.sort;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import ogrenciler.YigitOkur.sort.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {

   @Test
   void testEmptyArray() {
      int[] array = {};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{}, array);
   }

   @Test
   void testSingleElementArray() {
      int[] array = {5};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{5}, array);
   }

   @Test
   void testSortedArray() {
      int[] array = {1, 2, 3, 4, 5};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
   }

   @Test
   void testReverseSortedArray() {
      int[] array = {5, 4, 3, 2, 1};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
   }

   @Test
   void testAllElementsSame() {
      int[] array = {2, 2, 2, 2, 2};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{2, 2, 2, 2, 2}, array);
   }

   @Test
   void testNegativeNumbers() {
      int[] array = {-5, -10, 0, 5, 3};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{-10, -5, 0, 3, 5}, array);
   }

   @Test
   void testAllZeros() {
      int[] array = {0, 0, 0};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{0, 0, 0}, array);
   }

   @Test
   void testMixedNumbers() {
      int[] array = {1, 5, 3, 1, 2};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 1, 2, 3, 5}, array);
   }

   @Test
   void testLargeNumbers() {
      int[] array = {99999, 1000000, 99998};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{99998, 99999, 1000000}, array);
   }

   @Test
   void testAlternatingHighLow() {
      int[] array = {1, 100, 2, 99, 3, 98};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 2, 3, 98, 99, 100}, array);
   }

   @Test
   void testLargeArray() {
      int[] array = new int[100];
      for (int i = 0; i < 100; i++) {
         array[i] = 100 - i;
      }
      SelectionSort.selectionSort(array);
      for (int i = 0; i < 100; i++) {
         assertEquals(i + 1, array[i]);
      }
   }

   @Test
   void testTwoElements() {
      int[] array = {100, 1};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 100}, array);
   }

   @Test
   void testUnsortedArray() {
      int[] array = {5, 2, 9, 7, 1};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 2, 5, 7, 9}, array);
   }

   @Test
   void testNegativeUnsortedArray() {
      int[] array = {-5, -2, -9, -1, -3};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{-9, -5, -3, -2, -1}, array);
   }

   @Test
   void testMinMaxValues() {
      int[] array = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, array);
   }

   @Test
   void testSortedExceptLast() {
      int[] array = {1, 2, 3, 4, 100};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 2, 3, 4, 100}, array);
   }

   @Test
   void testSortedExceptFirst() {
      int[] array = {1, 1, 1, 1, 1000};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 1, 1, 1, 1000}, array);
   }

   @Test
   void testThreeElements() {
      int[] array = {100, 0, 50};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{0, 50, 100}, array);
   }

   @Test
   void testDuplicateElements() {
      int[] array = {2, 3, 2, 1, 4};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 2, 2, 3, 4}, array);
   }

   @Test
   void testHighLowArray() {
      int[] array = {100, 200, 300, 400, 1};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{1, 100, 200, 300, 400}, array);
   }

   @Test
   void testZerosAndOne() {
      int[] array = {0, 0, 0, 1};
      SelectionSort.selectionSort(array);
      assertArrayEquals(new int[]{0, 0, 0, 1}, array);
   }
}