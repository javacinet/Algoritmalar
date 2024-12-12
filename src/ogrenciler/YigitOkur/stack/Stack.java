package ogrenciler.YigitOkur.stack;

/*
 * @author of this code Yigit Okur (23Soft1040)
 * github.com/TurkishKEBAB
 */
public interface Stack<T> {
   void push(T item);

   T pop();

   T peek();

   boolean isEmpty();

   int size();
}