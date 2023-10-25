package joe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumSubArrayTest {
    @Test
    public void testToReturnHighestIndex(){
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] arr = {2, 4, 6, 4, 9, 1};
        maximumSubArray.maximum(2,arr);
        int[] expected = new int[]{12};
        assertArrayEquals(arr, expected);

    }

}