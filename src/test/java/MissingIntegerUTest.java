import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerUTest {

    MissingInteger testObj;

    @Before
    public void init(){
        testObj = new MissingInteger();
    }


    @Test
    public void findMissing4(){
        int[] A = {1,2,3};
        assertEquals(4, testObj.solution(A));
    }
    @Test
    public void findMissing5(){
        int[] A = {1, 3, 6, 4, 1, 2};
        assertEquals(5, testObj.solution(A));
    }

    @Test
    public void singleElement1(){
        int[] A = {1};
        assertEquals(2, testObj.solution(A));
    }
    @Test
    public void singleElement0(){
        int[] A = {0};
        assertEquals(1, testObj.solution(A));
    }
    @Test
    public void singleElementMinus(){
        int[] A = {-100};
        assertEquals(1, testObj.solution(A));
    }
    @Test
    public void singleElement2(){
        int[] A = {2};
        assertEquals(1, testObj.solution(A));
    }
}
