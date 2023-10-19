package tomi;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ReversalTest {

    @Test
    public void testThatANumberCanBeReversed(){
        Reversal reversal = new Reversal();
        int[] num1 = {2, 3, 4, 5, 6};
        int[] num2 = {7, 8, 9};

        ArrayList<Integer>actual = reversal.isReversed(num1,num2);
        List<Integer>expected = List.of(6,5,4,3,2,9,8,7);
        assertIterableEquals(expected, actual);


    }
}
