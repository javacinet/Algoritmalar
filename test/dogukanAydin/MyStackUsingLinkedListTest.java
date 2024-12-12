package dogukanAydin;

import ogrenciler.dogukanAydin.list.MyStackUsingLinkedList;
import org.junit.jupiter.api.BeforeEach;

public class MyStackUsingLinkedListTest extends AbstractStackTest{

    @BeforeEach
    public void setUp() {
        stack = new MyStackUsingLinkedList<>();
    }
}
