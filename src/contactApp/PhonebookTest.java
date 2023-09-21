package contactApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhonebookTest {
    Phonebook phonebook;
    @BeforeEach
    public void phonebook(){
        phonebook = new Phonebook();
    }
    @Test
    public void testThatContactCanBeAdded(){
        phonebook.addContact("Seyi", "Ikorodu","234","Email@yahoo.com");
        Assertions.assertEquals(new Contact("Seyi", "Ikorodu","234","Email@yahoo.com")
                .getName(),phonebook.findBy("Seyi").getName());

    }
    @Test
    public void testThatContactCanBeDeleted(){
        phonebook.addContact("Seyi", "Ikorodu","234","Email@yahoo.com");
        phonebook.deleteContact("Seyi","Ikorodu","234","Email@yahoo.com");
        Assertions.assertEquals(new Contact("Seyi","Ikorodu","234","Email@yahoo.com")
                .getName(),phonebook.findBy("Seyi").getName());
    }
}
