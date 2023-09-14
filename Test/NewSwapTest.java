import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewSwapTest {
    @Test
    public void testThatArrayIsEmpty(){
        int [] numbers = {};
        NewSwap.swapping(numbers);
        int [] expected = {};
        Assertions.assertArrayEquals(numbers, expected);
    }

    @Test
    public void testThatElementCanBeSwwapped(){
        NewSwap newSwap = new NewSwap();
        int [] numbers ={5, 10, 9, 2, 6, 5};
        int [] expected = {5, 10, 6, 2, 9, 5};
        Assertions.assertArrayEquals(expected,newSwap.swapped(2,4, numbers));


    }

}
