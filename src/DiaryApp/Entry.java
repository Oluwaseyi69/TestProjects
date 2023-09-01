package DiaryApp;

import java.time.LocalDate;

public class Entry {
    private  String body;
    private String title;
    private int id;


    public  Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body= body;
    }

    public int getId() {
        return id;
    }
    public String getEntry(){
        return id + " " + title + " " + body;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
