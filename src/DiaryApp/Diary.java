package DiaryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {
    private boolean isLocked = true;
    private String username;
    private Entry Entry;
    private String password;
    private List<Entry>diary = new ArrayList<>();
    private int id;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void lockDiary() {
    }

    public void unlockDiary(String password) {
        if(!Objects.equals(this.password, password)){
            throw new IllegalArgumentException(" Incorrect Password");
        }
        this.password = password;

    }
    public String validatePassword(String password) throws IllegalArgumentException {
        if (this.password.equals(password)) {

            return password;
        } else {
            throw new IllegalArgumentException("Input correct information");
        }
    }


    public void createEntry(int id, String title, String body) {
        Entry entry = new Entry(id,title,body);
        diary.add(entry);
    }

    public Entry findEntry(int id) {
        for(Entry entry :diary){
            if(entry.getId()== id){
                return entry;
            }
        }
        throw new IllegalArgumentException("Input a valid Account");

    }

    public void deleteEntry(int id) {
        Entry entry = findEntry(id);
        diary.remove(entry);
    }

    public void updateNewEntry(int id, String title, String body) {
        Entry entry = findEntry(id);
        entry.setId(id);
        entry.setTitle(title);
        entry.setBody(body);
    }

    public String getUsername() {
        return username;
    }
}

