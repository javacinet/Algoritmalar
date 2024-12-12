package ogrenciler.yigitOkur.stack;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */

import java.util.ArrayList;

public class StackUsingArrayList<T> implements Stack<T> {
   private final ArrayList<T> stack = new ArrayList<>();

   public static void main(String[] args) {
      StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println("Peek: " + stack.peek());
      System.out.println("Pop: " + stack.pop());
      System.out.println("Size: " + stack.size());
      System.out.println("Is Empty: " + stack.isEmpty());
   }

   @Override
   public void push(T item) {
      stack.add(item);
   }

   @Override
   public T pop() {
      if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
      }
      return stack.removeLast();
   }

   @Override
   public T peek() {
      if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
      }
      return stack.getLast();
   }

   @Override
   public boolean isEmpty() {
      return stack.isEmpty();
   }

   @Override
   public int size() {
      return stack.size();
   }
}