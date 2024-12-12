package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyQueueUsingLinkedList;
import org.junit.jupiter.api.BeforeEach;

public class MyQueueUsingLinkedListTest extends AbstractQueueTest{

    @BeforeEach
    public void setUp() {
        queue = new MyQueueUsingLinkedList<>();
    }
}
