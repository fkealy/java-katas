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
    public void basicAddition(){
        String additionTestString = "3 4 +";
        assertTrue(7.0 == testObj.calculate(additionTestString));
    }

    @Test
    public void basicSubtraction(){
        String minusTestString = "4 2 -";
        assertTrue(2 == testObj.calculate(minusTestString));
    }

    @Test
    public void basicMultiplication(){
        String multiplicationTestString = "2 3 *";
        assertTrue(6.0 == testObj.calculate(multiplicationTestString));
    }

    @Test
    public void basicDivision(){
        String divideTestString = "2 10 /";
        assertTrue(0.2 == testObj.calculate(divideTestString));
    }

    @Test
    public void complicatedBeast(){
        String complicatedBeastString = "3 4 + 5 - 6 * 3 /";
        assertTrue(4.0 == testObj.calculate(complicatedBeastString));
    }

}
