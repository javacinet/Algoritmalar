package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyDoubleLinkedList;
import org.junit.jupiter.api.BeforeEach;

public class DoubleLinkedListTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MyDoubleLinkedList<>();
    }
}
