package Snacks_16_07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewStringTest {
    @Test
    public void testToReturnName(){
        NewString newString = new NewString();
        String expected = "A. F. Sodiq";
        String actual =  newString.name("Akintomide Femi Sodiq");
        Assertions.assertEquals(expected, actual);
    }


}
