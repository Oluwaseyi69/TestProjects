package joe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovingZerosTest {

    @Test
    public void testToMoveZerosBackward(){
        MovingZeros movingZeros = new MovingZeros();
        int[] number = movingZeros.moveZero(new int[]{4, 3, 0, 2, 0, 4});
        int [] expected = {4, 3, 2, 4, 0, 0};
        assertArrayEquals(number,expected);
    }
}