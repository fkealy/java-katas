import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BowlingGameUTest {

    BowlingGame testObj;

    @Before
    public void setup() {
        testObj = new BowlingGame();
    }

    @Test
    public void calculatesStrikes() {
        testObj.setRolls("X X X X X X X X X X X X");
        assertTrue(testObj.score() == 300);
    }

    @Test
    public void calculateSpares() {
        testObj.setRolls("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5");
        assertTrue(testObj.score() == 150);

    }

    @Test
    public void calculateNines() {
        testObj.setRolls("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-");
        assertTrue(testObj.score() == 90);
    }
}
