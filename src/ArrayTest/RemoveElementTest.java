package ArrayTest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveElementTest {
    @Test
    public void testThatElementCanBeSubtractedByTwo() {
        RemoveElement removeElement = new RemoveElement();
        int[] numbers = {22, 41, 15, 8, 2, 1};
        int[] result = removeElement.remove(numbers); // Call the remove method and store the result
        int[] expected = {20, 39, 13, 6, 0, -1}; // Expected result after subtracting 2 from each element
        assertArrayEquals(expected, result); // Compare the expected result with the actual result
    }


}
