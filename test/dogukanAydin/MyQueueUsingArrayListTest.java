package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyQueueUsingArrayList;
import org.junit.jupiter.api.BeforeEach;

public class MyQueueUsingArrayListTest extends AbstractQueueTest{

    @BeforeEach
    public void setUp() {
        queue = new MyQueueUsingArrayList<>();
    }
}
