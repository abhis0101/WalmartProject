import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoMaxHeapsTest {

    @Test
    public void testInsert() {
        int x = 2;
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(x);
        heap.insert(5);
        heap.insert(10);
        assertEquals(10, heap.popMax());
        assertEquals(5, heap.popMax());
    }
    @Test
    public void testPopMax() {
        int x = 2;
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(x);
        heap.insert(5);
        heap.insert(10);
        heap.insert(7);
        assertEquals(10, heap.popMax());
        assertEquals(7, heap.popMax());
        assertEquals(5, heap.popMax());
    }
    @Test
    public void testInsertAgain() {
        int x = 4;
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(x);
        heap.insert(8);
        heap.insert(3);
        assertEquals(3, heap.popMax());
        assertEquals(8, heap.popMax());
    }
    @Test
    public void testPopMaxAgain() {
        int x = 4;
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(x);
        heap.insert(3);
        heap.insert(9);
        heap.insert(10);
        assertEquals(10, heap.popMax());
        assertEquals(9, heap.popMax());
        assertEquals(3, heap.popMax());
    }


}
