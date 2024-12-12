package ogrenciler.yigitOkur.heap;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import java.util.ArrayList;

public class Heap {
   private final ArrayList<Integer> heap = new ArrayList<>();

   public static void main(String[] args) {
      Heap heap = new Heap();
      heap.insert(3);
      heap.insert(1);
      heap.insert(6);
      heap.insert(5);
      heap.insert(2);
      heap.insert(4);

      System.out.println("Extracted min: " + heap.extractMin());
      System.out.println("Extracted min: " + heap.extractMin());
   }

   public void insert(int value) {
      heap.add(value);
      heapifyUp(heap.size() - 1);
   }

   public int extractMin() {
      if (heap.isEmpty()) {
         throw new IllegalStateException("Heap is empty");
      }
      int min = heap.getFirst();
      int last = heap.removeLast();
      if (!heap.isEmpty()) {
         heap.set(0, last);
         heapifyDown(0);
      }
      return min;
   }

   private void heapifyUp(int index) {
      while (index > 0) {
         int parentIndex = (index - 1) / 2;
         if (heap.get(index) >= heap.get(parentIndex)) {
            break;
         }
         swap(index, parentIndex);
         index = parentIndex;
      }
   }

   private void heapifyDown(int index) {
      int size = heap.size();
      while (index < size) {
         int leftChild = 2 * index + 1;
         int rightChild = 2 * index + 2;
         int smallest = index;

         if (leftChild < size && heap.get(leftChild) < heap.get(smallest)) {
            smallest = leftChild;
         }
         if (rightChild < size && heap.get(rightChild) < heap.get(smallest)) {
            smallest = rightChild;
         }
         if (smallest == index) {
            break;
         }
         swap(index, smallest);
         index = smallest;
      }
   }

   private void swap(int i, int j) {
      int temp = heap.get(i);
      heap.set(i, heap.get(j));
      heap.set(j, temp);
   }
}