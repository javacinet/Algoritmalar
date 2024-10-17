package YigitOkur.sort;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

   @Test
   void saçmaTestler01() {
      int[] Arayayım = {};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{}, Arayayım);
   }

   @Test
   void saçmaTestler02() {
      int[] Arayayım = {5};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{5}, Arayayım);
   }

   @Test
   void saçmaTestler3() {
      int[] Arayayım = {1, 2, 3, 4, 5};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arayayım);
   }

   @Test
   void saçmaTestler4() {
      int[] Arayayım = {5, 4, 3, 2, 1};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Arayayım);
   }

   @Test
   void saçmaTestler5() {
      int[] Arayayım = {2, 2, 2, 2, 2};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{2, 2, 2, 2, 2}, Arayayım);
   }

   @Test
   void saçmaTestler6() {
      int[] Arayayım = {-5, -10, 0, 5, 3};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{-10, -5, 0, 3, 5}, Arayayım);
   }

   @Test
   void saçmaTestler7() {
      int[] Arayayım = {0, 0, 0};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{0, 0, 0}, Arayayım);
   }

   @Test
   void saçmaTestler8() {
      int[] Arayayım = {1, 5, 3, 1, 2};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 1, 2, 3, 5}, Arayayım);
   }

   @Test
   void saçmaTestler9() {
      int[] Arayayım = {99999, 1000000, 99998};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{99998, 99999, 1000000}, Arayayım);
   }

   @Test
   void saçmaTestler10() {
      int[] Arayayım = {1, 100, 2, 99, 3, 98};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 2, 3, 98, 99, 100}, Arayayım);
   }

   @Test
   void saçmaTestler11() {
      int[] Arayayım = new int[100];
      for (int i = 0; i < 100; i++) {
         Arayayım[i] = 100 - i;
      }
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      for (int i = 0; i < 100; i++) {
         assertEquals(i + 1, Arayayım[i]);
      }
   }

   @Test
   void saçmaTestler12() {
      int[] Arayayım = {100, 1};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 100}, Arayayım);
   }

   @Test
   void saçmaTestler13() {
      int[] Arayayım = {5, 2, 9, 7, 1};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 2, 5, 7, 9}, Arayayım);
   }

   @Test
   void saçmaTestler14() {
      int[] Arayayım = {-5, -2, -9, -1, -3};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{-9, -5, -3, -2, -1}, Arayayım);
   }

   @Test
   void saçmaTestler15() {
      int[] Arayayım = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, Arayayım);
   }

   @Test
   void saçmaTestler16() {
      int[] Arayayım = {1, 2, 3, 4, 100};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 2, 3, 4, 100}, Arayayım);
   }

   @Test
   void saçmaTestler17() {
      int[] Arayayım = {1, 1, 1, 1, 1000};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 1, 1, 1, 1000}, Arayayım);
   }

   @Test
   void saçmaTestler18() {
      int[] Arayayım = {100, 0, 50};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{0, 50, 100}, Arayayım);
   }

   @Test
   void saçmaTestler19() {
      int[] Arayayım = {2, 3, 2, 1, 4};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 2, 2, 3, 4}, Arayayım);
   }

   @Test
   void saçmaTestler20() {
      int[] Arayayım = {100, 200, 300, 400, 1};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{1, 100, 200, 300, 400}, Arayayım);
   }

   @Test
   void saçmaTestler21() {
      int[] Arayayım = {0, 0, 0, 1};
      SelectionSort.SortTarafındanSeçiliyoruzMetodu(Arayayım);
      assertArrayEquals(new int[]{0, 0, 0, 1}, Arayayım);
   }

}