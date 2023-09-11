package ArrayTest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveElementTest {
    @Test
    public void testThatElementCanBeSubtractedByTwo(){
        int [] numbers = {22, 41,15,8,2,1};
        RemoveElement.remove(numbers);
        int [] expected = {39,13,-1};
        assertArrayEquals(expected,numbers);
    }
//    @Test
//    public void testThatYouCanMinusTwo(){
//        int [] numbers = {22, 41, 15,8, 2, 1};
//        RemoveElement.minus(numbers);
//        int [] newCount = {39,13,-1};
//        assertArrayEquals(newCount,numbers);
//        assertArrayEquals(newCount,numbers);
//    }
}
