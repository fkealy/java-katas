import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PDiffUTest {
    PDiff pDiff;

    @Before
    public void init() {
        this.pDiff = new PDiff();
    }

    @Test
    public void solutionWorksFor(){
        int[] A = { 3, 1 , 2, 4 ,3 };
        System.out.print(pDiff.solution(A));
        assertTrue(pDiff.solution(A) == 1);
    }



}
