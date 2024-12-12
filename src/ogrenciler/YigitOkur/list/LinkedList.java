package ogrenciler.YigitOkur.list;

/*
 * @author Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import java.util.Random;

public class LinkedList {

   private static final int INITIAL_CAPACITY = 16;
   private int[] elements;
   private int size = 0;

   public LinkedList() {
      elements = new int[INITIAL_CAPACITY];
   }

   public static void main(String[] args) {

      Random random = new Random();
      LinkedList list = new LinkedList();

      list.addLast(10);
      list.addLast(20);
      list.addLast(30);
      System.out.println("Size: " + list.size());
      System.out.println("Element at index 0: " + list.get(0));
      System.out.println("Element at index 1: " + list.get(1));
      System.out.println("Element at index 2: " + list.get(2));
      System.out.println("List contains 20: " + list.contains(20));
      System.out.println("List contains 40: " + list.contains(40));

      list.addFirst(5);
      System.out.println("Element at index 0 after adding to the beginning: " + list.get(0));

      list.removeLast();
      System.out.println("Size after removing the last element: " + list.size());

      list.removeFirst();
      System.out.println("Size after removing the first element: " + list.size());

      list.clear();
      System.out.println("Size after clearing the list: " + list.size());

      for (int i = 0; i < 100; i++) {
         int randomValue = random.nextInt(1000);
         list.addLast(randomValue);
      }
      System.out.println("Size after adding 100 random elements: " + list.size());
      System.out.println("Element at index 99: " + list.get(99));
      System.out.println("List contains 500: " + list.contains(500));

   }

   public void addLast(int e) {
      ensureCapacity();
      elements[size++] = e;
   }

   public int get(int index) {
      if (index >= size) {
         throw new ArrayIndexOutOfBoundsException(index);
      }
      return elements[index];
   }

   public boolean contains(int e) {
      for (int i = 0; i < size; i++) {
         if (elements[i] == e) {
            return true;
         }
      }
      return false;
   }

   public void addFirst(int e) {
      ensureCapacity();
      shiftRight();
      elements[0] = e;
      size++;
   }

   private void shiftRight() {
      if (elements.length <= size) {
         throw new ArrayIndexOutOfBoundsException(size);
      }
      for (int i = size; i > 0; i--) {
         elements[i] = elements[i - 1];
      }
   }

   private void ensureCapacity() {
      if (size >= elements.length) {
         int newCapacity = elements.length * 2;
         int[] newElements = new int[newCapacity];
         System.arraycopy(elements, 0, newElements, 0, elements.length);
         elements = newElements;
      }
   }

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   public void clear() {
      elements = new int[INITIAL_CAPACITY];
      size = 0;
   }

   public int removeLast() {
      if (isEmpty()) {
         throw new RuntimeException("List is empty");
      }
      return elements[--size];
   }

   public int removeFirst() {
      if (isEmpty()) {
         throw new RuntimeException("List is empty");
      }

      int returnValue = elements[0];
      for (int i = 0; i < size - 1; i++) {
         elements[i] = elements[i + 1];
      }

      elements[--size] = 0;
      return returnValue;
   }
}
