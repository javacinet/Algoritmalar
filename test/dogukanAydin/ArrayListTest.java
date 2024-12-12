package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyArrayList;
import org.junit.jupiter.api.BeforeEach;

public class ArrayListTest extends AbstractListTest {

    @BeforeEach
    public void setUp() {
        list = new MyArrayList<>();
    }
}
