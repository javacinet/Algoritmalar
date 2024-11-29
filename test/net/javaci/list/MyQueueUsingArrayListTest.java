package net.javaci.list;

import org.junit.jupiter.api.BeforeEach;

public class MyQueueUsingArrayListTest extends AbstractQueueTest {
    @BeforeEach
    public void setUp() {
        queue = new MyQueueUsingArrayList<>();
    }

}
