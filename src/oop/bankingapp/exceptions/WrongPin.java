package oop.bankingapp.exceptions;

public class WrongPin extends RuntimeException{
    public WrongPin(String message){
        super(message);
    }
}
