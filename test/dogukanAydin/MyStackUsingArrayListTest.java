package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyStackUsingArrayList;
import org.junit.jupiter.api.BeforeEach;

public class MyStackUsingArrayListTest extends AbstractStackTest{

    @BeforeEach
    public void setUp() {
        stack = new MyStackUsingArrayList<>();
    }
}
