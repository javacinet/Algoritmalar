package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyStackUsingArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyStackUsingArrayListTest extends AbstractStackTest{

    @BeforeEach
    public void setUp() {
        stack = new MyStackUsingArrayList<>();
    }

    @Test
    public void testPeekEmptyStack() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            stack.peek(); // Stack boşken peek çağrıldığında bir hata fırlatılmalı
        });

        assertEquals("Index out of range: -1", exception.getMessage()); // Hata mesajını kontrol et
    }
}
