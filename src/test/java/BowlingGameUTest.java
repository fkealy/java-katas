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
    public void calculateAllZeros() {
        testObj.setRolls("0 0 0 0 0 0 0 0 0 0 0");
        assertTrue(testObj.score() == 0);
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

    @Test
    public void calculateAllOnes() {
        testObj.setRolls("11 11 11 11 11 11 11 11 11 11");
        assertTrue(testObj.score() == 20);
    }

    @Test
    public void calculateSpareThenAllOnes() {
        testObj.setRolls("3/ 11 11 11 11 11 11 11 11 11");
        assertTrue(testObj.score() == 29);
    }

    @Test
    public void calculateAllOnesThenSpare() {
        testObj.setRolls("11 11 11 11 11 11 11 11 11 1/ 1");
        assertTrue(testObj.score() == 29);
    }

    @Test
    public void calculateStrikeThenAllOnes() {
        testObj.setRolls("X 11 11 11 11 11 11 11 11 11 11");
        assertTrue(testObj.score() == 30);
    }

    @Test
    public void calculateAllOnesThenStrike() {
        testObj.setRolls("11 11 11 11 11 11 11 11 11 X 11");
        assertTrue(testObj.score() == 30);
    }
}
