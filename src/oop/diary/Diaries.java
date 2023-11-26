package oop.diary;

import oop.diary.exceptions.DiaryDoesNotExist;
import oop.diary.exceptions.UsernameNotFound;

import java.util.ArrayList;

public class Diaries {
    ArrayList<Diary> diaries = new ArrayList<>();

    public int numberOfDiary() {
        return diaries.size();
    }

    public void add(String username, String password) {
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    public Diary findDiary(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) return diary;
        }
        throw new UsernameNotFound("This username does not exist");
    }

    public void delete(String username, String password) {
        for (Diary diary: diaries) {
            if (diary.getUsername().equals(username) && diary.getPassword().equals(password)) diaries.remove(diary);
            else throw new DiaryDoesNotExist("Diary with this username and password");
        }
    }

}
