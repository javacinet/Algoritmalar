package net.javaci.list;

import org.junit.jupiter.api.BeforeEach;

public class CircularArrayTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MyCircularArray<>();
    }

}
