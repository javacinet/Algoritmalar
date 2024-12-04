package serhat.test;

import net.javaci.list.exception.EmptyListException;
import ogrenciler.serhat.list.MyStackUsingLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackUsingLinkedListTest {
    MyStackUsingLinkedList<String> stack = new MyStackUsingLinkedList<>();
    @Test
    public void testPush() {

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

        assertThrows(EmptyListException.class, () -> stack.pop());
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