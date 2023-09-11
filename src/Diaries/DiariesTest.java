package Diaries;

import DiaryApp.Diary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiariesTest {
    Diaries diaries;
    @BeforeEach
    public void diaries(){
    diaries = new Diaries();
    }
    @Test
    public void testThat_A_DiaryCanBeAdded(){
        diaries.addDiary("temitope","seyi");
        Assertions.assertEquals(new Diary("temitope","seyi").getUsername(), diaries.findByUsername("temitope").getUsername());

    }
    @Test
    public void testThat_A_DiaryCanBeDeleted(){
        diaries.addDiary("Anu","Banwo");
        diaries.deleteDiary("Anu","Banwo");
        Assertions.assertEquals(new Diary("Anu", "Banwo").getUsername(),diaries.findByUsername("Anu").getUsername());
    }
}
