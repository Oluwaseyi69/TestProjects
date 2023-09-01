package ChapterThree;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarTest {

    @Test
    public void testThatCarExist(){
        Car car = new Car("camry","2010",65.45);
        assertNotNull(car);

    }
}
