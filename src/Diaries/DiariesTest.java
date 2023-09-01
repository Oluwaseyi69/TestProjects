package Diaries;

import DiaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DiariesTest {
    Diaries diaries;
    @BeforeEach
    public void diaries(){
    diaries = new Diaries();
    }
    @Test
    public void testThat_A_DiaryCanBeAdded(){
        diaries.addDiary("temitope","seyi");
        assertEquals(new Diary("temitope","seyi").getUsername(),diaries.findByUsername("temitope").getUsername());

    }
    @Test
    public void testThat_A_DiaryCanBeDeleted(){
        diaries.deleteDiary("Anu","Banwo");
    }
}
