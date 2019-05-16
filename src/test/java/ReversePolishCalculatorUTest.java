import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishCalculatorUTest {

    ReversePolishCalculator testObj;

    @Before
    public void setup(){
        testObj = new ReversePolishCalculator();
    }

    @Test
    public void reversePolishFor3Plus4(){
        String additionTestString = "3 4 +";
        assertEquals(java.util.Optional.of(7),testObj.calculate(additionTestString));
    }
}
