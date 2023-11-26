package oop.diary.exceptions;

public class CannotBeFound extends RuntimeException{
    public CannotBeFound(String message){
        super(message);
    }
}
