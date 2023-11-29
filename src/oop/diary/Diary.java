package oop.diary;

import oop.diary.exceptions.CannotBeFound;
import oop.diary.exceptions.LockedDiary;
import oop.diary.exceptions.WrongPassword;

import java.util.ArrayList;

public class Diary {
    private final String password;
    private boolean isLocked = true;
    private int sizeOfEntries;
    private final String username;
    ArrayList<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        entries = new ArrayList<>();
    }


    public void unlockDiary(String password) {
        validate(password);
        isLocked = false;
    }

    private void validate(String password) {
        if (!password.equals(this.password)) throw new WrongPassword("Incorrect password");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public Entry createEntry(String title, String body) {
        validateLock();
        sizeOfEntries++;
        Entry entry = new Entry(generateID(), title, body);
        entries.add(entry);
        entry.date();
        return entry;
    }


    private void validateLock() {
        if (isLocked) throw new LockedDiary("Diary is locked! Unlock to perform action");
    }

    public int generateID() {
        return Integer.parseInt(22 + "" +sizeOfEntries);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        entries.remove(findEntry(id));
    }

    public Entry findEntry(int id) {
        validateLock();
        for (Entry entry: entries){
            if(entry.getIDNumber() == id) return entry;
        }
        throw new CannotBeFound("Entry cannot be found");
    }

    public void updateEntry(int id, String title, String body){
        validateLock();
        Entry entry = findEntry(id);
        String message = entry.getBody() + " " + body;
        entry.setBody(message);
    }

    public int findIndexOf(int id) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getIDNumber() == id) return index;
        }
        throw new CannotBeFound("Entry cannot be found");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }
}
