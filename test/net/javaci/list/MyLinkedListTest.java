package net.javaci.list;

import org.junit.jupiter.api.BeforeEach;

public class MyLinkedListTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MySingleLinkedList<>();
    }

}
