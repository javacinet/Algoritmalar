package dogukanAydin;

import ogrenciler.dogukanAydin.list.MySingleLinkedList;
import org.junit.jupiter.api.BeforeEach;

public class SingleLinkedListTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MySingleLinkedList<>();
    }
}
