import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryChopUTest {

    BinaryChop testObj;
    int[] testData = new int[]{1,3,5};

    @Before
    public void setup() {
        testObj = new BinaryChop();
    }

    @Test
    public void binaryChopForNonExistingValue() {
        assertEquals(-1,testObj.chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1,testObj.chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1,testObj.chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1,testObj.chop(6, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void binaryChopForExistingValue() {
        assertEquals(0,testObj.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,testObj.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,testObj.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,testObj.chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(2,testObj.chop(3, new int[]{1,2, 3, 5, 7,9,10,11,13}));
    }
}
