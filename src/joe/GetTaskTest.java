package joe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetTaskTest {

    @Test
    public void testToGetIndex() {
        Task task = new Task();
        int[] number = {6, 2, 3, 4, 1, 0, 5};
        String word = "kissdry";
        String expected = "yssdikr";
        Assertions.assertEquals(expected, task.newTask(word,number) );

    }

    @Test
    public void testToPushZerosToLastIndex(){
        Task task = new Task();
        int[] number = {2, 0, 4, 5, 0, 1, 3, 0, 5};
        task.zeroIndex(number);
        int[] expected = {2, 4, 5, 1, 3, 5, 0, 0, 0};
        Assertions.assertArrayEquals(expected, number);
    }
}
