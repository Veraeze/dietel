package oop.diary.exceptions;

public class DiaryDoesNotExist extends RuntimeException{
    public DiaryDoesNotExist(String message){
        super(message);
    }
}
