import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    int[] array = {5,6,2,35,7,4};
    int[] arrayExpected = {2,4,5,6,7,35};
    Sorting sorter;

    @Before
    public void setup() {
        array = new int[] {5,6,2,35,7,4};
        sorter = new Sorting();
    }

    @Test
    public void selectionTest() {
        sorter.selectionSort(array);
        assertArrayEquals(arrayExpected,array);
    }

    @Test
    public void insertionTest() {
        sorter.insertionSort(array);
        assertArrayEquals(arrayExpected,array);
    }

}