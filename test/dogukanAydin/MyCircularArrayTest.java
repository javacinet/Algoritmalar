package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyCircularArray;
import org.junit.jupiter.api.BeforeEach;

public class MyCircularArrayTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MyCircularArray<>();
    }
}
