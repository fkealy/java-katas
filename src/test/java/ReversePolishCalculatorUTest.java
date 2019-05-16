import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ReversePolishCalculatorUTest {

    ReversePolishCalculator testObj;

    @Before
    public void setup(){
        testObj = new ReversePolishCalculator();
    }

    @Test
    public void reversePolishFor3Plus4(){
        String additionTestString = "3 4 +";
        assertTrue(7.0 == testObj.calculate(additionTestString));
    }
}
