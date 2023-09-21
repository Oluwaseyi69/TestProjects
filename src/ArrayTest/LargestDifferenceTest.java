package ArrayTest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LargestDifferenceTest {
    @Test
    public void testToReturnLargestDifference(){
        int[] number = {4, 6, 2, 6, 9, 1};
        int numbers = LargestDifference.large(number);
        int  expected = 8;
        assertEquals(expected, numbers);
    }

}
