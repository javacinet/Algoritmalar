package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyStackUsingLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyStackUsingLinkedListTest extends AbstractStackTest{

    @BeforeEach
    public void setUp() {
        stack = new MyStackUsingLinkedList<>();
    }

    @Test
    public void testPeekEmptyStack() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            stack.peek(); // Stack boşken peek çağrıldığında bir hata fırlatılmalı
        });

        assertEquals("Index out of range: 0", exception.getMessage()); // Hata mesajını kontrol et
    }
}
