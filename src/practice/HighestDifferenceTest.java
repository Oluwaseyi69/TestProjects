package practice;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class HighestDifferenceTest {
    @Test
    public void testToReturnIndex(){
        int[] numbers = {1, 5, 7, 9};
        int[] newNumbers = Highest.getHighest(numbers,12);
        int[] expected = {1, 2};
        assertArrayEquals(expected, newNumbers);

    }


}
