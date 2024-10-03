package net.javaci.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void addFirstTest() {
        ArrayList list = new ArrayList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(5);

        assertEquals(4, list.size());
        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
        assertEquals(20, list.get(2));
        assertEquals(30, list.get(3));

    }
}
