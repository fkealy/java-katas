import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlusOneUTest {

    PlusOne plusOne = new PlusOne();

    @Test
    public void  plusOneWorksZero(){
        Integer[] inputArr  = { 0 };
        ArrayList<Integer> input  = new ArrayList<>(Arrays.asList(inputArr));
        Integer[] expectedArr  = { 1};
        List<Integer> expected  = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,plusOne.plusOne(input));
    }

    @Test
    public void  plusOneWorksForLongRang(){
        Integer[] inputArr  = { 2, 5, 6, 8, 6, 1, 2, 4, 5 };
        ArrayList<Integer> input  = new ArrayList<>(Arrays.asList(inputArr));
        Integer[] expectedArr  = { 2, 5, 6, 8, 6, 1, 2, 4, 6};
        List<Integer> expected  = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,plusOne.plusOne(input));
    }

    @Test
    public void  plusOneWorksFor99999(){
        Integer[] inputArr  = { 9, 9, 9, 9, 9 };
        ArrayList<Integer> input  = new ArrayList<>(Arrays.asList(inputArr));
        Integer[] expectedArr  = { 1,0 ,0 ,0 ,0 ,0};
        List<Integer> expected  = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,plusOne.plusOne(input));
    }

    @Test
    public void  plusOneWorksFor199999(){
        Integer[] inputArr  = { 1,9, 9, 9, 9, 9 };
        ArrayList<Integer> input  = new ArrayList<>(Arrays.asList(inputArr));
        Integer[] expectedArr  = { 2 ,0 ,0 ,0 ,0 ,0};
        List<Integer> expected  = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,plusOne.plusOne(input));
    }

    @Test
    public void  plusOneWorksFor9(){
        Integer[] inputArr  = { 9};
        ArrayList<Integer> input  = new ArrayList<>(Arrays.asList(inputArr));
        Integer[] expectedArr  = { 1, 0};
        List<Integer> expected  = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,plusOne.plusOne(input));
    }

    @Test
    public void  plusOneWorksFor0starting(){
        Integer[] inputArr  = { 0,1,2,3};
        ArrayList<Integer> input  = new ArrayList<>(Arrays.asList(inputArr));
        Integer[] expectedArr  = { 1,2,4};
        List<Integer> expected  = new ArrayList<>(Arrays.asList(expectedArr));
        assertEquals(expected,plusOne.plusOne(input));
    }
}
