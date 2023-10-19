package contactApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
    Contact contact;
    @BeforeEach
    public void contact(){
        contact = new Contact("seyi","ikorodu","2348166672396","email");
    }
    @Test
    public void testThatNameCanBeAdded(){
        contact.addName("Seyi");
        String name = contact.getName();
        Assertions.assertEquals("Seyi", name);
    }
    @Test
    public void testThatAddressCanBeAdded(){
        contact.addAddress("Ikorodu");
        String address = contact.getAddress();
        Assertions.assertEquals("Ikorodu",address);
    }
    @Test
    public void testThatPhoneNumberCanbeAddedToContact(){
        contact.addPhone("2342");
        String phoneNumber = contact.getTelephone();
        Assertions.assertEquals("2342",phoneNumber);
    }
    @Test
    public void testThatEmailCanBeAddedToContact(){
        contact.addEmail("Email@yahoo.com");
        String email = contact.getEmail();
        Assertions.assertEquals("Email@yahoo.com", email);
    }


}
