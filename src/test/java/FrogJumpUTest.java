import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpUTest {

    FrogJump frogJump;

    @Before
    public void init(){
        frogJump = new FrogJump();
    }

    @Test
    public void trivialCaseSol1(){
        int[] A = {1,3,1, 4, 2, 3, 5, 4};
        long startTime = System.nanoTime();
        assertEquals(6,frogJump.solution1(5,A));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime));
    }
    @Test
    public void trivialCaseSol2(){
        int[] A = {1,3,1, 4, 2, 3, 5, 4};
        long startTime = System.nanoTime();
        assertEquals(6,frogJump.solution2(5,A));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime));
    }
    @Test
    public void trivialCaseSol3(){
        int[] A = {1,3,1, 4, 2, 3, 5, 4};
        long startTime = System.nanoTime();
        assertEquals(6,frogJump.solution3(5,A));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime));
    }

}