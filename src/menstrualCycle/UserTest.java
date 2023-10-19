package menstrualCycle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user;
    @BeforeEach
    public void user(){
        user = new User(1,"seyi", "email","password");
    }
    @Test
    public void testThatUserCanBeAdded(){
        user.addUser(1,"here is my flow");
        Assertions.assertEquals(new Notification(1,"here is my flow").getNotificationId(),user.getUserId());
    }

    @Test
    public void testThatUserCanBeDeleted(){
        user.addUser(1,"the flow is much!!!");
        user.deleteUser(1);
        Assertions.assertThrows(IllegalArgumentException.class,()-> user.findUser(1));

    }
    @Test
    public void testThatUserCanUpdateSymptoms(){
        user.addUser(1,"the flow is much!!!");
        user.updateUser(1,"the flow has reduced thank you.");
        Assertions.assertEquals(new Notification(1, "the flow has reduced thank you.").getNotificationId(),user.getUserId());

    }
    @Test
    public void testForCycleLength(){
        user.addUser(1,"the flow is much!!!");
        int actual = user.getCycleLength(27,31,25,3);
        int expected = 27;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testForOvulationPeriod(){
        user.addUser(1,"the flow is much!!!");
        int actual = user.ovulationPeriod(28);
        int expected = 12;
        Assertions.assertEquals(actual, expected);
        
    }
}






