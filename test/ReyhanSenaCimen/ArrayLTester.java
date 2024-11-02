package ReyhanSenaCimen;

import ogrenciler.ReyhanSenaCimen.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayLTester {
    private ArrayList arrayList;

    @BeforeEach
    public void setUp() {
        arrayList = new ArrayList();
    }

    @Test
    public void testAddLast() {
        arrayList.addLast(10);
        arrayList.addLast(20);
        arrayList.addLast(30);

        assertEquals(3, arrayList.size(), "Dizi boyutu 3 olmalı.");
        assertEquals(10, arrayList.get(0), "Index 0'deki eleman 10 olmalı.");
        assertEquals(20, arrayList.get(1), "Index 1'deki eleman 20 olmalı.");
        assertEquals(30, arrayList.get(2), "Index 2'deki eleman 30 olmalı.");
    }

    @Test
    public void testGetOutOfBounds() {
        arrayList.addLast(10);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayList.get(1);
        }, "Index 1'de bir eleman olmamalı.");
    }

    @Test
    public void testContains() {
        arrayList.addLast(10);
        arrayList.addLast(20);
        assertTrue(arrayList.contains(20), "Dizi 20'yi içermeli.");
        assertFalse(arrayList.contains(30), "Dizi 30'u içermemeli.");
    }

    @Test
    public void testAddSomewhereOverride() {
        arrayList.addLast(10);
        arrayList.addLast(20);


        String simulatedInput = "override\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        arrayList.addSomewhere(1, 30);

        System.setIn(originalIn);

        assertEquals(30, arrayList.get(1), "Index 1'deki eleman 30 olmalı.");
        assertEquals(20, arrayList.get(2), "Index 2'deki eleman 20 olmalı.");
    }

    @Test
    public void testAddSomewhereShift() {
        arrayList.addLast(10);
        arrayList.addLast(20);


        String simulatedInput = "shift\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        arrayList.addSomewhere(0, 30);

        System.setIn(originalIn);

        assertEquals(30, arrayList.get(0), "Index 0'daki eleman 30 olmalı.");
        assertEquals(10, arrayList.get(1), "Index 1'deki eleman 10 olmalı.");
        assertEquals(20, arrayList.get(2), "Index 2'deki eleman 20 olmalı.");
    }
}
