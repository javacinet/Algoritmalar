package dogukanAydin;

import ogrenciler.dogukanAydin.list.MySingleListWithTailList;
import org.junit.jupiter.api.BeforeEach;

public class SingleLinkedListWithTailTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MySingleListWithTailList<>();
    }
}
