package yigitOkur.list;

import ogrenciler.yigitOkur.list.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

   private LinkedList list;

   @BeforeEach
   public void setup() {
      list = new LinkedList();
   }

   @Test
   public void testAddLast() {
      list.addLast(10);
      assertEquals(1, list.size());
      assertEquals(10, list.get(0));
   }

   @Test
   public void testAddMultiple() {
      for (int i = 0; i < 100; i++) {
         list.addLast(i);
      }
      assertEquals(100, list.size());
      assertEquals(99, list.get(99));
   }

   @Test
   public void testContainsTrue() {
      list.addLast(50);
      assertTrue(list.contains(50));
   }

   @Test
   public void testContainsFalse() {
      assertFalse(list.contains(50));
   }

   @Test
   public void testRemoveLast() {
      list.addLast(50);
      list.addLast(100);
      list.removeLast();
      assertEquals(1, list.size());
      assertEquals(50, list.get(0));
   }

   @Test
   public void testAddFirst() {
      list.addLast(20);
      list.addLast(30);
      list.addFirst(10);
      assertEquals(3, list.size());
      assertEquals(10, list.get(0));
      assertEquals(20, list.get(1));
      assertEquals(30, list.get(2));
   }

   @Test
   public void testGetOutOfBounds() {
      int index = 1;
      list.addLast(100);
      Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> list.get(index));
      assertEquals("Array index out of range: " + index, exception.getMessage());
   }

   @Test
   public void testEmptyListSize() {
      assertEquals(0, list.size());
   }

   @Test
   public void testAddAndRemoveMixed() {
      list.addLast(50);
      list.addLast(100);
      list.removeLast();
      list.addFirst(10);
      assertEquals(2, list.size());
      assertEquals(10, list.get(0));
      assertEquals(50, list.get(1));
   }
}