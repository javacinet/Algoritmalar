package YigitOkur.sort;

import ogrenciler.YigitOkur.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
 * Author: Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

class BubbleSortTest {

   @Test
   void testBubbleSort() {
      int[] array = {64, 34, 25, 12, 22, 11, 90};
      BubbleSort.bubbleSort(array);
      assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, array);
   }

   @Test
   void testEmptyArray() {
      int[] array = {};
      BubbleSort.bubbleSort(array);
      assertArrayEquals(new int[]{}, array);
   }

   @Test
   void testSingleElementArray() {
      int[] array = {5};
      BubbleSort.bubbleSort(array);
      assertArrayEquals(new int[]{5}, array);
   }
}