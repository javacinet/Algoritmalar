package dogukanAydin;

import ogrenciler.dogukanAydin.Exceptions.EmptyListException;
import ogrenciler.dogukanAydin.list.AbstractCollection;
import ogrenciler.dogukanAydin.list.Interfaces.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractStackTest extends AbstractCollection {
    protected MyStack<Integer> stack;

    @Test
    public void testPush() {
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size()); // Stack boyutunun 2 olması gerekir
    }

    @Test
    public void testPop() {
        stack.push(10);
        stack.push(20);

        int poppedValue = stack.pop();
        assertEquals(20, poppedValue); // Son eklenen değer (stack'in üstü) 20 olmalı

        assertEquals(1, stack.size()); // Stack boyutunun 1 olması gerekir
    }

    @Test
    public void testPeek() {
        stack.push(10);
        stack.push(20);

        int peekedValue = stack.peek();
        assertEquals(20, peekedValue); // Son eklenen değer (stack'in üstü) 20 olmalı
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size()); // Stack başlangıçta boş olmalı

        stack.push(10);
        assertEquals(1, stack.size()); // Stack boyutunun 1 olması gerekir

        stack.push(20);
        assertEquals(2, stack.size()); // Stack boyutunun 2 olması gerekir
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty()); // Stack başlangıçta boş olmalı

        stack.push(10);
        assertFalse(stack.isEmpty()); // Stack boş olmamalı
    }

    @Test
    public void testPopEmptyStack() {
        Exception exception = assertThrows(EmptyListException.class, () -> {
            stack.pop(); // Stack boşken pop çağrıldığında bir hata fırlatılmalı
        });

        assertEquals(null, exception.getMessage()); // Hata mesajını kontrol et
    }

    @Test
    public void testPeekEmptyStack() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            stack.peek(); // Stack boşken peek çağrıldığında bir hata fırlatılmalı
        });

        assertEquals("", exception.getMessage()); // Hata mesajını kontrol et
    }
}
