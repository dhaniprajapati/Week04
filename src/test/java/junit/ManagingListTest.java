package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.junit.ManagingList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ManagingListTest {

    private ManagingList manager;
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        manager = new ManagingList();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        manager.addElement(list, 5);
        manager.addElement(list, 10);
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        list.add(5);
        list.add(10);
        manager.removeElement(list, 5);
        assertTrue(!list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    public void testGetSize() {
        list.add(5);
        list.add(10);
        int size = manager.getSize(list);
        assertEquals(2, size);
    }
}
