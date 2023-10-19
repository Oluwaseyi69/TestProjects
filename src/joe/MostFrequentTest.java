package joe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostFrequentTest {
    @Test
    public void testForMostFrequentNumber(){
        MostFrequent mostFrequent = new MostFrequent();
        int[] numbers = {2, 2, 1, 1, 2, 2, 2};

        Assertions.assertEquals(2, mostFrequent.frequent(numbers));
    }
}
