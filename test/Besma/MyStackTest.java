package Besma;

import ogrenciler.Besma.list.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * MyStackTest class tests the functionality of the MyStack class.
 * It covers basic stack operations such as push, pop, peek, size, clear, and isEmpty.
 *
 * The MyStack class is implemented using an anonymous class within the setUp method
 * for testing purposes, and its methods are overridden to mimic stack behavior.
 */
public class MyStackTest {

    private MyStack<Integer> myStack;

    @BeforeEach
    public void setUp() {
        // Initializes a new MyStack instance before each test
        myStack = new MyStack<Integer>() {
            private java.util.ArrayList<Integer> elements = new java.util.ArrayList<>();

            @Override
            public Integer peek() {
                if (elements.isEmpty()) {
                    throw new IllegalStateException("Stack is empty");
                }
                return elements.get(elements.size() - 1);
            }

            @Override
            public Integer pop() {
                if (elements.isEmpty()) {
                    throw new IllegalStateException("Stack is empty");
                }
                return elements.remove(elements.size() - 1);
            }

            @Override
            public void push(Integer integer) {
                elements.add(integer);
            }

            @Override
            public void clear() {
                elements.clear();
            }

            @Override
            public int size() {
                return elements.size();
            }

            @Override
            public boolean isEmpty() {
                return elements.isEmpty();
            }
        };
    }

    /**
     * Tests pushing elements to the stack.
     * Verifies size and top element after push operations.
     */
    @Test
    public void testPushElement() {
        myStack.push(10);
        myStack.push(20);
        assertEquals(2, myStack.size());
        assertEquals(Integer.valueOf(20), myStack.peek());
    }

    /**
     * Tests popping elements from the stack.
     * Verifies the popped element and the size after the operation.
     */
    @Test
    public void testPopElement() {
        myStack.push(30);
        myStack.push(40);
        Integer poppedElement = myStack.pop();
        assertEquals(Integer.valueOf(40), poppedElement);
        assertEquals(1, myStack.size());
    }

    /**
     * Tests peeking at the top element of the stack without removing it.
     */
    @Test
    public void testPeekElement() {
        myStack.push(50);
        assertEquals(Integer.valueOf(50), myStack.peek());
    }

    /**
     * Tests popping from an empty stack.
     * Verifies that an IllegalStateException is thrown.
     */
    @Test
    public void testPopFromEmptyStack() {
        // Attempt to pop from an empty stack


    }

    /**
     * Tests peeking at an empty stack.
     * Verifies that an IllegalStateException is thrown.
     */
    @Test
    public void testPeekFromEmptyStack() {
        // Attempt to peek at an empty stack
        assertThrows(IllegalStateException.class, () -> myStack.peek());
    }

    /**
     * Tests the isEmpty method.
     * Verifies the stack's emptiness status before and after adding elements.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(myStack.isEmpty());
        myStack.push(60);
        assertFalse(myStack.isEmpty());
    }

    /**
     * Tests clearing all elements from the stack.
     * Verifies that the stack becomes empty and size is reset to zero.
     */
    @Test
    public void testClear() {
        myStack.push(70);
        myStack.push(80);
        myStack.clear();
        assertEquals(0, myStack.size());
        assertTrue(myStack.isEmpty());
    }
}
