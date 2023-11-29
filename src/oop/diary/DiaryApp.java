package oop.diary;

import java.util.Scanner;

public class DiaryApp {
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        print("""
                ============================
                        My Secret
                ============================
                press 1 -> Create  diary
                press 2 -> Unlock diary
                press 3 -> Lock diary
                press 4 -> exit
                """);
        String select = input(String.class);
        switch (select){
            case "1" -> createDiary();
            case "2" -> unlockDiary();
            case "3" -> lockDiary();
            case "4" -> exitDiary();
        }
    }
    static Diary myDiary;

    private static void exitDiary() {
        System.exit(0);

    }

    private static void lockDiary(){
        if (myDiary ==  null){
        print("Diary does not exist! create a diary");
        mainMenu();
        }
        try {
            myDiary.lockDiary();
            mainMenu();
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }

    }

    private static void unlockDiary() {
        if (myDiary ==  null){
            print("Diary does not exist! create a diary");
            mainMenu();
        }
        print("Enter password");
        String password = input(String.class);
        try {
            myDiary.unlockDiary(password);
        }
        catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
        unlocked();
    }
    private static void unlocked(){
        System.out.println("""
                press 1 -> Add Entry
                press 2 -> Find Entry
                press 3 -> Update Entry
                press 4 -> Delete Entry
                press 5 -> Main Menu
                """);
        String select = input(String.class);
        switch (select){
            case "1" -> addEntry();
            case "2" -> findEntry();
            case "3" -> updateEntry();
            case "4" -> deleteEntry();
            default -> mainMenu();
        }
    }

    private static void deleteEntry() {
        print("Enter entry id");
        int id = input(Integer.class);
        try {
            myDiary.deleteEntry(id);
            print("Entry deleted!");
            unlockDiary();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            unlockDiary();
        }
    }

    private static void updateEntry() {
        print("Enter entry id");
        int id = input(Integer.class);

        print("Compose a title for your entry");
        String title = input(String.class);

        print("What do you want to share today?");
        String body = input(String.class);
        try {
            myDiary.updateEntry(id, title, body);
            print("Entry has been updated");
            unlockDiary();
        }
        catch (Exception exception){
            print(exception.getMessage());
            unlockDiary();
        }
    }

    private static void findEntry() {
        print("Enter entry id");
        int id = input(Integer.class);
        try {
            System.out.println(myDiary.findEntry(id));
            unlockDiary();
        }
        catch (Exception exception){
            print(exception.getMessage());
            unlockDiary();
        }
    }

    private static void addEntry() {
        print("Compose a title for your entry");
        String title = input(String.class);

        print("What do you want to share today?");
        String body = input(String.class);

        System.out.println(myDiary.createEntry(title, body));
        print("Entry added!");

        unlockDiary();
    }

    private static void createDiary() {
        print("Enter username");
        String username = input(String.class);

        print("Enter password");
        String password = input(String.class);

        myDiary = new Diary(username, password);
        mainMenu();
    }


    private static <T> T input(Class<T> value){
        Scanner scanner = new Scanner(System.in);
        T element = null;

        if (value.equals(String.class)){
            element = value.cast(scanner.nextLine());
        }
        else if (value.equals(Integer.class)){
            element = value.cast(scanner.nextInt());
        }
        else if (value.equals(Double.class)){
            element = value.cast(scanner.nextDouble());
        }
        else if (value.equals(Long.class)){
            element = value.cast(scanner.nextLong());
        }
        return element;
    }

    private static void print(String message){
        System.out.println(message);
    }
}
