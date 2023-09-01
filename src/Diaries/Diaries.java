package Diaries;

import DiaryApp.Diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private String username;
    private String password;
    private List<Diary>diaries = new ArrayList<>();

    public void addDiary(String username, String password) {
        Diary diary = new Diary(username,password);
        diaries.add(diary);
    }

    public Diary findByUsername(String username){
        for(Diary diary: diaries){
            if(diary.getUsername().equals(username)){
                return diary;
            }
        }
        throw new IllegalArgumentException("Input a valid Account");
    }

    public void deleteDiary(String username, String password) {
        Diary diary = new Diary(username,password);
        diaries.remove(diary);

    }
}
