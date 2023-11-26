package oop.diary.exceptions;

public class LockedDiary extends RuntimeException{
    public LockedDiary(String message){
        super(message);
    }
}
