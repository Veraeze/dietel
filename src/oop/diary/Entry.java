package oop.diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
    public Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getIDNumber() {
        return id;
    }


    public void date(){
         dateCreated = LocalDateTime.now();
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getBody(){
        return body;
    }

    public String toString(){
        return String.format("""
                            ==========================
                            Entry ID: %d
                            Title of entry: %s
                            Body of entry: %s
                            Date created: %s
                            ==========================
                             """, id, title, body, dateCreated);
    }
}
