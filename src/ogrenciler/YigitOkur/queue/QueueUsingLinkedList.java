package ogrenciler.YigitOkur.queue;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList<T> implements Queue<T> {
   private final LinkedList<T> queue = new LinkedList<>();

   public static void main(String[] args) {
      QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
      queue.add(1);
      queue.add(2);
      queue.add(3);
      System.out.println("Dequeue: " + queue.remove());
      System.out.println("Size: " + queue.size());
      System.out.println("Is Empty: " + queue.isEmpty());
   }

   @Override
   public boolean add(T item) {
      return queue.add(item);
   }

   @Override
   public boolean offer(T item) {
      return queue.add(item);
   }

   @Override
   public T remove() {
      if (isEmpty()) {
         throw new IllegalStateException("Queue is empty");
      }
      return queue.removeFirst();
   }

   @Override
   public T poll() {
      if (isEmpty()) {
         return null;
      }
      return queue.removeFirst();
   }

   @Override
   public T element() {
      if (isEmpty()) {
         throw new IllegalStateException("Queue is empty");
      }
      return queue.getFirst();
   }

   @Override
   public T peek() {
      if (isEmpty()) {
         return null;
      }
      return queue.getFirst();
   }

   @Override
   public int size() {
      return queue.size();
   }

   @Override
   public boolean isEmpty() {
      return queue.isEmpty();
   }

   @Override
   public boolean contains(Object o) {
      return queue.contains(o);
   }

   @Override
   public Iterator<T> iterator() {
      return queue.iterator();
   }

   @Override
   public Object [] toArray() {
      return queue.toArray();
   }

   @Override
   public <T1> T1 [] toArray(T1 [] a) {
      return queue.toArray(a);
   }

   @Override
   public boolean remove(Object o) {
      return queue.remove(o);
   }

   @Override
   public boolean containsAll(Collection<?> c) {
      return queue.containsAll(c);
   }

   @Override
   public boolean addAll(Collection<? extends T> c) {
      return queue.addAll(c);
   }

   @Override
   public boolean removeAll(Collection<?> c) {
      return queue.removeAll(c);
   }

   @Override
   public boolean retainAll(Collection<?> c) {
      return queue.retainAll(c);
   }

   @Override
   public void clear() {
      queue.clear();
   }
}