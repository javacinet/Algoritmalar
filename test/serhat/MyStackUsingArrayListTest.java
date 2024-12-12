package serhat;

import net.javaci.list.exception.EmptyListException;
import ogrenciler.serhat.list.MyStackUsingArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackUsingArrayListTest {

    MyStackUsingArrayList<String> stack = new MyStackUsingArrayList<>();

    @Test
    public void testPush() {
        // Test deklarasyonu yapmamıza gerek yok. JUnit tarafından otomatik olarak oluşturulacaktır.

        stack.push("Test1");
        assertEquals(1, stack.size());
    }

    @Test
    public void testPop() {

        stack.push("Test1");
        stack.push("Test2");

        String result = stack.pop();
        assertEquals("Test2", result);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmptyStack() {

        assertThrows(net.javaci.list.exception.EmptyListException.class, () -> stack.pop());
    }

    @Test
    public void testPeek() {

        stack.push("Test1");
        assertEquals("Test1", stack.peek());
    }

    @Test
    public void testPeekEmptyStack() {

        assertThrows(EmptyListException.class, () -> stack.peek());
    }

    @Test
    public void testIsEmpty() {

        assertTrue(stack.isEmpty());

        stack.push("Test1");
        assertFalse(stack.isEmpty());
    }
}