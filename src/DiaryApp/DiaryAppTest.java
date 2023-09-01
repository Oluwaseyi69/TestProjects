package DiaryApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DiaryAppTest {
    Diary diary;
    @BeforeEach
    public void diary(){
        diary = new Diary("seyi","temitope");
    }
    @Test
    public void testThatDiaryExist(){
        Assertions.assertNotNull(diary);
    }
    @Test
    public  void testThatDiaryIsLocked(){
        Assertions.assertTrue(diary.isLocked());
    }
    @Test
    public void testThatDiaryCanBeLocked(){
        diary.lockDiary();
        Assertions.assertTrue(diary.isLocked());
    }
    @Test
    public void testThatDiaryCanBeUnlocked(){
        diary.unlockDiary("temitope");
        Assertions.assertTrue(diary.isLocked());
    }
    @Test
    public void testThatNewEntryCanBeCreated(){
        diary.createEntry(1,"Thoughts","These are my Thoughts");
        Assertions.assertEquals(new Entry(1,"Thoughts","These are my Thoughts").getEntry(),diary.findEntry(1).getEntry());
    }
    @Test
    public void testThatEntryCanBeDeleted(){
        diary.createEntry(1,"Thoughts","These are my thoughts");
        diary.deleteEntry(1);
        Assertions.assertThrows(IllegalArgumentException.class,()-> {diary.findEntry(1).getEntry();});
    }
    @Test
    public void testThatEntryCanBeUpdated(){
        diary.createEntry(2,"Dear Diary","Thanks to the giver of life");
        diary.updateEntry(2,"Dear","Thankful");
        Assertions.assertEquals(new Entry(2,"Dear","Thankful").getEntry(),diary.findEntry(2).getEntry());
    }


}

